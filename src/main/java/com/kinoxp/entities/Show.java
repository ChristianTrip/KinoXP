package com.kinoxp.entities;

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

    private Theater theater;

    private ShowingTime showingTime;

    @ManyToOne (cascade = CascadeType.ALL)
    private Movie movie;

    public Show(Theater theater, ShowingTime showingTime, Movie movie) {
        this.theater = theater;
        this.showingTime = showingTime;
        this.movie = movie;
    }
}
