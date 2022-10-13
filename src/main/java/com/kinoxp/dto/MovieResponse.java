package com.kinoxp.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kinoxp.entities.Genre;
import com.kinoxp.entities.Movie;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MovieResponse {

    private Long id;
    private String title;
    private Genre genre;
    private int ageLimit;
    private int productionYear;
    private int runningTime; // In minuts


    public MovieResponse(Movie movie){
        this.id = movie.getId();
        this.title = movie.getTitle();
        this.genre = movie.getGenre();
        this.ageLimit = movie.getAgeLimit();
        this.productionYear = movie.getProductionYear();
        this.runningTime = movie.getRunningTime();
    }
}
