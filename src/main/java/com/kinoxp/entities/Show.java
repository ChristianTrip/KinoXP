package com.kinoxp.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
//@AllArgsConstructor
@Entity
public class Show {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Theaters theater;

    private ShowingTimes showingTimes;

    @ManyToOne (cascade = CascadeType.ALL)
    private Movie movie;

    public Show(Theaters theater, ShowingTimes showingTimes, Movie movie) {
        this.theater = theater;
        this.showingTimes = showingTimes;
        this.movie = movie;
    }
}
