package org.cobra.sample.models;

import com.netflix.hollow.core.write.objectmapper.HollowPrimaryKey;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Random;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@HollowPrimaryKey(fields = "id")
public class Movie {

    private int id;
    private String title;
    private String genre;
    private double rating;
    private String director;
    private String imageUrl = "https://my-cobra.s3.ap-southeast-1.amazonaws.com/posters/v1-poster.png";


    static String[] titles = {"Inception", "Titanic", "The Matrix", "Avatar", "The Godfather", "Interstellar", "Jaws",
            "Gladiator", "The Dark Knight", "Pulp Fiction"};
    static String[] directors = {"Christopher Nolan", "James Cameron", "Steven Spielberg", "Ridley Scott", "Quentin " +
            "Tarantino", "Francis Ford Coppola", "Martin Scorsese", "Peter Jackson"};
    static String[] genres = {"Action", "Drama", "Comedy", "Horror", "Science Fiction", "Fantasy", "Thriller", "Romance"};
    static String[] countries = {"USA", "UK", "Canada", "India", "Australia", "France", "Germany", "Japan"};

    public static Movie generateRandomMovie(int id) {
        Random random = new Random();
        Movie movie = new Movie();

        // Random values for the fields

        movie.id = id;
        movie.title = titles[random.nextInt(titles.length)] + " - " + random.nextInt(1, Integer.MAX_VALUE);
        movie.director = directors[random.nextInt(directors.length)];
        movie.genre = genres[random.nextInt(genres.length)];
        movie.rating = 5.0 + (random.nextDouble() * 5.0); // Random rating between 5.0 and 10.0

        return movie;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", rating=" + rating +
                ", title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", genre='" + genre + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
