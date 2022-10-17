package com.kinoxp.services;

import com.kinoxp.dto.CustomerResponse;
import com.kinoxp.dto.MovieRequest;
import com.kinoxp.dto.MovieResponse;
import com.kinoxp.entities.Customer;
import com.kinoxp.entities.Genre;
import com.kinoxp.entities.Movie;
import com.kinoxp.repositories.MovieRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;

@ExtendWith(MockitoExtension.class)
class MovieServiceTest {

    @Mock
    MovieRepository movieRepository;

    @Autowired
    MovieService movieService;

    @BeforeEach
    public void setup() {
        movieService = new MovieService(movieRepository);
    }


    @Test
    void getAllMovies() {
        Mockito.when(movieRepository.findAll()).thenReturn(List.of(
                new Movie("First Blood", Genre.ACTION, 16, 1982, 93),
                new Movie("Rambo: First Blood 2", Genre.ACTION, 16, 1985, 95)
        ));
        List<MovieResponse> movies = movieService.getAllMovies();
        assertEquals(2, movies.size());
    }

    @Test
    void getMovieById() throws Exception {
        Movie movie = new Movie("First Blood", Genre.ACTION, 16, 1982, 93);
        Mockito.when(movieRepository.findById(1L)).thenReturn(Optional.of(movie));
        MovieResponse movieResponse = movieService.getMovieById(1L);
        assertEquals("First Blood", movieResponse.getTitle());
    }


    @Test
    void addMovie() throws Exception {
        Movie movie = new Movie("First Blood", Genre.ACTION, 16, 1982, 93);

        Mockito.when(movieRepository.save(any(Movie.class))).thenReturn(movie);
        MovieRequest request = new MovieRequest(movie);
        MovieResponse found = movieService.addMovie(request);
        assertEquals("First Blood", found.getTitle());
    }

}
