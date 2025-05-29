package org.cobra.sample.hollow.consumer.infrastructure;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.netflix.hollow.api.consumer.HollowConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class S3AnnouncementWatcher implements HollowConsumer.AnnouncementWatcher {

    private static final Logger log = LoggerFactory.getLogger(S3AnnouncementWatcher.class);
    private final AmazonS3 s3;
    private final String bucketName;
    private final String blobNamespace;

    private final List<HollowConsumer> subscribedConsumers;

    private long latestVersion;

    public S3AnnouncementWatcher(AWSCredentials awsCredentials, String bucketName, String blobNamespace) {
        this.s3 = new AmazonS3Client(awsCredentials);
        this.bucketName = bucketName;
        this.blobNamespace = blobNamespace;

        this.subscribedConsumers = Collections.synchronizedList(new ArrayList<HollowConsumer>());

        this.latestVersion = readLatestVersion();

        setupPollingThread();
    }


    public void setupPollingThread() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                while(true) {
                    try {
                        long currentVersion = readLatestVersion();
                        if(latestVersion != currentVersion) {
                            latestVersion = currentVersion;
                            for(HollowConsumer consumer : subscribedConsumers) {
                                log.info("trigger refresh");
                                consumer.triggerAsyncRefresh();
                            }
                        }

                        Thread.sleep(1000);
                    } catch(Throwable th) {
                        th.printStackTrace();
                    }
                }
            }
        });

        t.setName("hollow-s3-announcementwatcher-poller");
        t.setDaemon(true);
        t.start();
    }

    @Override
    public long getLatestVersion() {
        return latestVersion;
    }

    @Override
    public void subscribeToUpdates(HollowConsumer consumer) {
        subscribedConsumers.add(consumer);
    }


    private long readLatestVersion() {
        return Long.parseLong(s3.getObjectAsString(bucketName, blobNamespace + "/" + "announced.version"));
    }
}
