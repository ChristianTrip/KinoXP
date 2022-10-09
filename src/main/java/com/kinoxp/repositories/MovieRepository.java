package com.kinoxp.repositories;

import com.kinoxp.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MovieRepository extends JpaRepository<Movie, Long> {

}
