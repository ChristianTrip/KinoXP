package com.kinoxp.api;

import com.kinoxp.dto.MovieRequest;
import com.kinoxp.dto.MovieResponse;
import com.kinoxp.services.MovieService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
@CrossOrigin //giver adgang til at andre servere kan hente data herfra
public class MovieController {

    private MovieService service;

    private MovieController(MovieService service){
        this.service = service;
    }

    @GetMapping("")
    public List<MovieResponse> getAllMovies(){
        return service.getAllMovies();
    }

    @PostMapping
    public MovieResponse addMovie(@RequestBody MovieRequest body){
        return service.addMovie(body);
    }

}

