package org.cobra.sample.hollow.producer;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.netflix.hollow.api.producer.HollowProducer;
import org.cobra.sample.common.MovieCSVFactory;
import org.cobra.sample.common.MovieCSVReader;
import org.cobra.sample.common.MyAWSCredential;
import org.cobra.sample.hollow.producer.infrastructure.S3Announcer;
import org.cobra.sample.hollow.producer.infrastructure.S3Publisher;
import org.cobra.sample.models.Movie;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Producer {
    private static final long MIN_TIME_BETWEEN_CYCLES = 60_000;


    public static void main(String[] args) throws InterruptedException, FileNotFoundException {

        AWSCredentials awsCredentials = new BasicAWSCredentials(
                MyAWSCredential.AWS_ACCESS_KEY,
                MyAWSCredential.AWS_SECRET_KEY);

        HollowProducer.Publisher publisher = new S3Publisher(awsCredentials, "my-cobra", "publisher");
        HollowProducer.Announcer announcer = new S3Announcer(awsCredentials, "my-cobra", "announcer");

        HollowProducer producer = new HollowProducer.Builder<>()
                .withPublisher(publisher)
                .withAnnouncer(announcer)
                .build();

        producer.initializeDataModel(Movie.class);
        List<String> csvFiles = MovieCSVFactory.csvFiles();
        for (String fileName : csvFiles) {
            System.out.println("Loading " + fileName);
        }

//        List<Movie> movies = MovieCSVReader.readCSV(csvFiles.getFirst());
//        for (Movie movie : movies) {
//            System.out.println(movie);
//        }

        ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor(Thread.ofVirtual().factory());
        AtomicInteger i = new AtomicInteger();
        CountDownLatch latch = new CountDownLatch(1);

        scheduler.scheduleAtFixedRate(() -> {
            if (i.get() >= csvFiles.size()) {
                return;
            }
            try {
                List<Movie> moviesFromCsv = MovieCSVReader.readCSV(csvFiles.get(i.getAndIncrement()));
                producer.runCycle((task) -> {
                    for (Movie movie : moviesFromCsv) {
                        task.add(movie);
                    }
                });
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }

        }, 5_000, MIN_TIME_BETWEEN_CYCLES, TimeUnit.MILLISECONDS);

        latch.await();
    }

}
