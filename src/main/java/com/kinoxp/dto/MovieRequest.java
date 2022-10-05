package com.kinoxp.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.kinoxp.entities.Genres;
import com.kinoxp.entities.Movie;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MovieRequest {

    private String title;
    private Genres genre;
    private int ageLimit;
    private int productionYear;
    private int runningTime; // In minuts

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss",shape = JsonFormat.Shape.STRING)
    private LocalDateTime created;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss",shape = JsonFormat.Shape.STRING)
    private LocalDateTime edited;

    public MovieRequest(Movie movie){
        this.title = movie.getTitle();
        this.genre = movie.getGenre();
        this.ageLimit = movie.getAgeLimit();
        this.productionYear = movie.getProductionYear();
        this.runningTime = movie.getRunningTime();
        this.created = movie.getCreated();
        this.edited = movie.getEdited();
    }

}
