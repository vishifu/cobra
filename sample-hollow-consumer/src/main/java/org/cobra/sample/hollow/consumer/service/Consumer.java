package org.cobra.sample.hollow.consumer.service;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.netflix.hollow.api.consumer.HollowConsumer;
import org.cobra.sample.common.MyAWSCredential;
import org.cobra.sample.hollow.consumer.generated.MovieAPI;
import org.cobra.sample.hollow.consumer.infrastructure.S3AnnouncementWatcher;
import org.cobra.sample.hollow.consumer.infrastructure.S3BlobRetriever;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("singleton")
public class Consumer {

    private final HollowConsumer consumer;

    public Consumer() {
        AWSCredentials awsCredentials = new BasicAWSCredentials(MyAWSCredential.AWS_ACCESS_KEY,
                MyAWSCredential.AWS_SECRET_KEY);

        HollowConsumer.BlobRetriever blobRetriever = new S3BlobRetriever(awsCredentials, "my-cobra", "publisher");
        HollowConsumer.AnnouncementWatcher announcementWatcher = new S3AnnouncementWatcher(awsCredentials, "my-cobra", "announcer");

        consumer = HollowConsumer.withBlobRetriever(blobRetriever)
                .withAnnouncementWatcher(announcementWatcher)
                .withGeneratedAPIClass(MovieAPI.class)
                .build();

        consumer.triggerRefresh();
    }

    public HollowConsumer getConsumer() {
        return consumer;
    }

}
