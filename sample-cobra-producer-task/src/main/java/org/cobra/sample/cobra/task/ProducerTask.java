package org.cobra.sample.cobra.task;

import org.cobra.producer.CobraProducer;
import org.cobra.producer.fs.FilesystemAnnouncer;
import org.cobra.producer.fs.FilesystemBlobStagger;
import org.cobra.producer.fs.FilesystemPublisher;
import org.cobra.sample.common.MovieCSVFactory;
import org.cobra.sample.common.MovieCSVReader;
import org.cobra.sample.models.Movie;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ProducerTask {

    private static final Logger log = LoggerFactory.getLogger(ProducerTask.class);

    private static final long MIN_TIME_BETWEEN_CYCLES = 60_000;

    public static void main(String[] args) {

        String dir = System.getenv("PUBLISH_DIR");
        if (dir == null) {
            dir = "./misc/publish-dir";
        }

        Path publishDir = Paths.get(dir);
        log.info("Publishing directory: {}", publishDir);

        CobraProducer.BlobPublisher publisher = new FilesystemPublisher(publishDir);
        CobraProducer.Announcer announcer = new FilesystemAnnouncer(publishDir);
        CobraProducer.BlobStagger stagger = new FilesystemBlobStagger();

        CobraProducer producer = CobraProducer.fromBuilder()
                .withBlobPublisher(publisher)
                .withAnnouncer(announcer)
                .withLocalPort(7070)
                .withBlobStagger(stagger)
                .withBlobStorePath(publishDir)
                .withRestoreIfAvailable(true)
                .buildSimple();

        producer.registerModel(Movie.class);
        producer.bootstrap();

        /* scheduler population */
        ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor(Thread.ofVirtual().factory());
        List<String> csvFiles = MovieCSVFactory.csvFiles();
        AtomicInteger count = new AtomicInteger(0);

        scheduler.scheduleAtFixedRate(() -> {
            if (count.get() >= csvFiles.size()) {
                return;
            }

            producer.populate(task -> {
                List<Movie> movies = MovieCSVReader.readCSV(csvFiles.get(count.getAndIncrement()));
                for (Movie movie : movies) {
                    task.addObject(String.valueOf(movie.getId()), movie);
                }
            });

        }, 5_000, MIN_TIME_BETWEEN_CYCLES, TimeUnit.MILLISECONDS);
    }
}
