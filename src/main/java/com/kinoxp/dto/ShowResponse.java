package com.kinoxp.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.kinoxp.entities.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShowResponse {

    private Long id;
    private Theater theater;
    private ShowingTime showingTime;
    private Movie movie;


    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss",shape = JsonFormat.Shape.STRING)
    private LocalDateTime created;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss",shape = JsonFormat.Shape.STRING)
    private LocalDateTime edited;

    public ShowResponse(Show show){
        this.id = show.getId();
        this.theater = show.getTheater();
        this.showingTime = show.getShowingTime();
        this.movie = show.getMovie();
        this.created = movie.getCreated();
        this.edited = movie.getEdited();
    }
}
