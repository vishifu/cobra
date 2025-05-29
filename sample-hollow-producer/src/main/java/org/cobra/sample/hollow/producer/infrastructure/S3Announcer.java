package org.cobra.sample.hollow.producer.infrastructure;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.netflix.hollow.api.producer.HollowProducer;

public class S3Announcer implements HollowProducer.Announcer {
    public static final String ANNOUNCEMENT_OBJECTNAME = "announced.version";

    private final AmazonS3 s3;
    private final String bucketName;
    private final String blobNamespace;

    public S3Announcer(AWSCredentials awsCredentials, String bucketName, String blobNamespace) {
        this.s3 = new AmazonS3Client(awsCredentials);
        this.bucketName = bucketName;
        this.blobNamespace = blobNamespace;
    }

    @Override
    public void announce(long l) {
        s3.putObject(bucketName, blobNamespace + "/" + ANNOUNCEMENT_OBJECTNAME, String.valueOf(l));
    }

}
