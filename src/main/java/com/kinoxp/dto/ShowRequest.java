package com.kinoxp.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.kinoxp.entities.Movie;
import com.kinoxp.entities.Show;
import com.kinoxp.entities.ShowingTime;
import com.kinoxp.entities.Theater;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ShowRequest {

    private Theater theater;
    private ShowingTime showingTime;
    private Movie movie;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss",shape = JsonFormat.Shape.STRING)
    private LocalDateTime created;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss",shape = JsonFormat.Shape.STRING)
    private LocalDateTime edited;


    public ShowRequest(Show show){
        this.theater = show.getTheater();
        this.showingTime = show.getShowingTime();
        this.movie = show.getMovie();
        this.created = movie.getCreated();
        this.edited = movie.getEdited();
        }

}
