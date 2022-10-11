package com.kinoxp.dto;

import com.kinoxp.entities.Show;
import com.kinoxp.entities.ShowingTime;
import com.kinoxp.entities.Theater;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class  ShowRequest {

    private Theater theater;
    private ShowingTime showingTime;
    private long movieID;

    private LocalDate date;

    /**
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss",shape = JsonFormat.Shape.STRING)
    private LocalDateTime created;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss",shape = JsonFormat.Shape.STRING)
    private LocalDateTime edited;
**/

public ShowRequest(Show show){
        this.theater = show.getTheater();
        this.showingTime = show.getShowingTime();
        this.movieID = getMovieID();
        this.date = show.getDate();
        //this.movie = show.getMovie();
        }

}
