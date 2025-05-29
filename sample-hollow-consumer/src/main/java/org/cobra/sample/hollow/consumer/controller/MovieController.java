package org.cobra.sample.hollow.consumer.controller;

import com.netflix.hollow.api.consumer.index.UniqueKeyIndex;
import org.cobra.sample.hollow.consumer.service.Consumer;
import org.cobra.sample.models.Movie;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/movie")
public class MovieController {

    private final Consumer consumer;

    UniqueKeyIndex<org.cobra.sample.hollow.consumer.generated.Movie, Integer> idx ;

    public MovieController(Consumer consumer) {
        this.consumer = consumer;
        this.idx = org.cobra.sample.hollow.consumer.generated.Movie.uniqueIndex(consumer.getConsumer());
    }

    @GetMapping("hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("{id}")
    public Movie getMovie(@PathVariable int id){
        org.cobra.sample.hollow.consumer.generated.Movie movie =  idx.findMatch(id);
        if (movie == null) {
            return null;
        }
        return new Movie(movie.getId(), movie.getTitle(), movie.getGenre(), movie.getRating(), movie.getDirector(),
                movie.getImageUrl());
    }

}
