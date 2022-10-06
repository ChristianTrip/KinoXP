package com.kinoxp.entities;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Builder
@Entity
@Table(name="shows")
public class Show {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="theater", nullable = false)
    private Theater theater;

    @Column(name="showing_time", nullable = false)
    private ShowingTime showingTime;

    @ManyToOne (cascade = CascadeType.ALL)
    Movie movie;



    public Show(Long id, Theater theater, ShowingTime showingTime, Movie movie) {
        this.id = id;
        this.theater = theater;
        this.showingTime = showingTime;
        this.movie = movie;
    }
}
