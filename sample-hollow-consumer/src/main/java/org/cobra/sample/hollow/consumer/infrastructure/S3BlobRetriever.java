package org.cobra.sample.hollow.consumer.infrastructure;

import com.amazonaws.SdkBaseException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.AmazonS3Exception;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.transfer.Download;
import com.amazonaws.services.s3.transfer.TransferManager;
import com.netflix.hollow.api.consumer.HollowConsumer;
import com.netflix.hollow.core.memory.encoding.HashCodes;
import com.netflix.hollow.core.memory.encoding.VarInt;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class S3BlobRetriever implements HollowConsumer.BlobRetriever {

    private final AmazonS3 s3;
    private final TransferManager s3TransferManager;
    private final String bucketName;
    private final String blobNamespace;

    public S3BlobRetriever(AWSCredentials credentials, String bucketName, String blobNamespace) {
        this.s3 = new AmazonS3Client(credentials);
        this.s3TransferManager = new TransferManager(s3);
        this.bucketName = bucketName;
        this.blobNamespace = blobNamespace;
    }

    @Override
    public HollowConsumer.Blob retrieveSnapshotBlob(long desiredVersion) {
        try {
            return knownSnapshotBlob(desiredVersion);
        } catch (AmazonS3Exception transitionNotFound) {
        }

        /// There was no exact match for a snapshot leading to the desired state.
        /// We'll use the snapshot index to find the nearest one before the desired state.
        try {
            File f = downloadFile(getSnapshotIndexObjectName(blobNamespace));
            long snapshotIdxLength = f.length();
            long pos = 0;
            long currentSnapshotStateId = 0;

            try (InputStream is = new BufferedInputStream(new FileInputStream(f))) {
                while (pos < snapshotIdxLength) {
                    long nextGap = VarInt.readVLong(is);

                    if (currentSnapshotStateId + nextGap > desiredVersion) {
                        if (currentSnapshotStateId == 0)
                            return null;

                        return knownSnapshotBlob(currentSnapshotStateId);
                    }

                    currentSnapshotStateId += nextGap;
                    pos += VarInt.sizeOfVLong(nextGap);
                }

                if (currentSnapshotStateId != 0)
                    return knownSnapshotBlob(currentSnapshotStateId);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return null;
    }

    @Override
    public HollowConsumer.Blob retrieveDeltaBlob(long currentVersion) {
        try {
            return knownDeltaBlob("delta", currentVersion);
        } catch (AmazonS3Exception transitionNotFound) {
            return null;
        }
    }

    @Override
    public HollowConsumer.Blob retrieveReverseDeltaBlob(long currentVersion) {
        try {
            return knownDeltaBlob("reversedelta", currentVersion);
        } catch (AmazonS3Exception transitionNotFound) {
            return null;
        }
    }

    private HollowConsumer.Blob knownSnapshotBlob(long desiredVersion) {
        String objectName = getS3ObjectName(blobNamespace, "snapshot", desiredVersion);
        ObjectMetadata objectMetadata = s3.getObjectMetadata(bucketName, objectName);
        long toState = Long.parseLong(objectMetadata.getUserMetaDataOf("to_state"));

        return new S3Blob(objectName, toState);
    }

    private HollowConsumer.Blob knownDeltaBlob(String fileType, long fromVersion) {
        String objectName = getS3ObjectName(blobNamespace, fileType, fromVersion);
        ObjectMetadata objectMetadata = s3.getObjectMetadata(bucketName, objectName);
        long fromState = Long.parseLong(objectMetadata.getUserMetaDataOf("from_state"));
        long toState = Long.parseLong(objectMetadata.getUserMetaDataOf("to_state"));

        return new S3Blob(objectName, fromState, toState);
    }

    private class S3Blob extends HollowConsumer.Blob {

        private final String objectName;

        public S3Blob(String objectName, long toVersion) {
            super(toVersion);
            this.objectName = objectName;
        }

        public S3Blob(String objectName, long fromVersion, long toVersion) {
            super(fromVersion, toVersion);
            this.objectName = objectName;
        }

        @Override
        public InputStream getInputStream() throws IOException {

            final File tempFile = downloadFile(objectName);

            return new BufferedInputStream(new FileInputStream(tempFile)) {
                @Override
                public void close() throws IOException {
                    super.close();
                    tempFile.delete();
                }
            };

        }

    }

    private File downloadFile(String objectName) throws IOException {
        File tempFile = new File(System.getProperty("java.io.tmpdir"), objectName.replace('/', '-'));

        Download download = s3TransferManager.download(bucketName, objectName, tempFile);

        try {
            download.waitForCompletion();
        } catch (SdkBaseException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        return tempFile;
    }

    public static String getS3ObjectName(String blobNamespace, String fileType, long lookupVersion) {
        StringBuilder builder = new StringBuilder(getS3ObjectPrefix(blobNamespace, fileType));
        builder.append(Integer.toHexString(HashCodes.hashLong(lookupVersion)));
        builder.append("-");
        builder.append(lookupVersion);
        return builder.toString();
    }

    private static String getS3ObjectPrefix(String blobNamespace, String fileType) {
        StringBuilder builder = new StringBuilder(blobNamespace);
        builder.append("/").append(fileType).append("/");
        return builder.toString();
    }

    public static String getSnapshotIndexObjectName(String blobNamespace) {
        return blobNamespace + "/snapshot.index";
    }

}
