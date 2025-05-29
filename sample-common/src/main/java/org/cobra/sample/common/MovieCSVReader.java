package org.cobra.sample.common;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.cobra.sample.models.Movie;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MovieCSVReader {

    private static final String tmpUrl = "https://my-cobra.s3.ap-southeast-1.amazonaws.com/posters/v1-poster.png";

    public static List<Movie> readCSV(String fileName) throws FileNotFoundException {
        return readCSV(new FileReader(fileName));
    }

    public static List<Movie> readCSV(InputStreamReader is) {
        List<Movie> movies = new ArrayList<>();
        try (CSVReader reader = new CSVReader(is)) {
            String[] line;
            boolean firstLine = true; // Skip header

            while ((line = reader.readNext()) != null) {
                if (firstLine) {
                    firstLine = false;
                    continue;
                }

                // Read CSV fields
                int id = Integer.parseInt(line[0]);
                String title = line[1];
                String genre = line[2];
                double rating = Double.parseDouble(line[3]);
                String director = line[4];
                String imageUrl = line[5];

                // Create Movie object
                movies.add(new Movie(id, title, genre, rating, director, imageUrl));
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        }

        return movies;
    }
}
