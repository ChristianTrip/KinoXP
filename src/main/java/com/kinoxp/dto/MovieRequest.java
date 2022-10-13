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
public class MovieRequest {

    private String title;
    private Genre genre;
    private int ageLimit;
    private int productionYear;
    private int runningTime; // In minuts


    public static Movie getMovieEntity(MovieRequest movieRequest){
        return Movie.builder()
                .title(movieRequest.title)
                .genre(movieRequest.genre)
                .ageLimit(movieRequest.ageLimit)
                .productionYear(movieRequest.productionYear)
                .runningTime(movieRequest.runningTime)
                .title(movieRequest.title)
                .build();
    }

    public MovieRequest(Movie movie){
        this.title = movie.getTitle();
        this.genre = movie.getGenre();
        this.ageLimit = movie.getAgeLimit();
        this.productionYear = movie.getProductionYear();
        this.runningTime = movie.getRunningTime();
    }

}
