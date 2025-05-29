package org.cobra.sample.hollow.consumer.controller;

import org.cobra.sample.hollow.consumer.service.MovieService;
import org.cobra.sample.models.Movie;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/movie")
public class ApiMovieController {

    private final MovieService movieService;

    public ApiMovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("{id}")
    public Movie getMovie(@PathVariable("id") int id) {
        return movieService.getMovie(id);
    }

    @GetMapping("version")
    public long getVersion() {
        return movieService.getCurrentVersion();
    }
}
