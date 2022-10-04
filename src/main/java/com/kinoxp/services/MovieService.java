package com.kinoxp.services;

import com.kinoxp.dto.MovieResponse;
import com.kinoxp.entities.Movie;
import com.kinoxp.repositories.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieService {

    private MovieRepository repository;

    public MovieService(MovieRepository repository){
        this.repository = repository;
    }

    public List<MovieResponse> getAllMovies(){
        List<Movie> movies = repository.findAll();
        List<MovieResponse> movieResponses = movies
                        .stream()
                        .map(movie -> new MovieResponse(movie, true))
                        .collect(Collectors.toList());
        return movieResponses;
    }
}
