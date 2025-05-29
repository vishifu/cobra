package org.cobra.sample.producer.controller;

import org.cobra.sample.producer.service.ProducerService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/movie")
public class ApiMovieController {

    private final ProducerService producerService;

    public ApiMovieController(ProducerService producerService) {
        this.producerService = producerService;
    }

    @GetMapping("version")
    public long getVersion() {
        return producerService.getCurrentVersion();
    }
}
