package com.kinoxp.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.kinoxp.entities.Movie;
import com.kinoxp.entities.Show;
import com.kinoxp.entities.ShowingTime;
import com.kinoxp.entities.Theater;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShowResponse {

    private int id;
    private Theater theater;
    private ShowingTime showingTime;
    private Movie movie;

    private LocalDate date;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss",shape = JsonFormat.Shape.STRING)
    private LocalDateTime created;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss",shape = JsonFormat.Shape.STRING)
    private LocalDateTime edited;

    public ShowResponse(Show show, boolean includeAll){
        this.id = show.getId();
        this.theater = show.getTheater();
        this.showingTime = show.getShowingTime();
        this.movie = show.getMovie();
        this.date = show.getDate();
        if (includeAll){
            this.created = show.getCreated();
            this.edited = show.getEdited();
        }
    }
}
