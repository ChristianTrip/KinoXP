package com.kinoxp.entities;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="shows")
public class Show {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="theater", nullable = false)
    private Theater theater;

    @Column(name="showing_time", nullable = false)
    private ShowingTime showingTime;

    @ManyToOne (cascade = CascadeType.ALL)
    Movie movie;

    @OneToMany
    private List<Seat> seats;

    private LocalDate date;

    @CreationTimestamp
    private LocalDateTime created;
    @UpdateTimestamp
    private LocalDateTime edited;


    public Show(Theater theater, ShowingTime showingTime, Movie movie, LocalDate date) {
        this.theater = theater;
        this.showingTime = showingTime;
        this.movie = movie;
        this.date = date;

        int rows = this.theater.getRows();
        int numbInRows = this.theater.getNumbersInRow();
        setupSeats(rows, numbInRows);
    }


    private void setupSeats(int rows, int numbersInRow){
        for (int row = 1; row <= rows; row++) {
            for (int numbInRow = 1; numbInRow <= numbersInRow; numbInRow++) {
                this.seats.add(new Seat(row, numbInRow));
            }
        }
    }

}
