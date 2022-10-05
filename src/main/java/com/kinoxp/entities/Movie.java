package com.kinoxp.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "genre", nullable = false)
    private Genres genre;
    @Column(name = "age_limit", nullable = false)
    private int ageLimit;
    @Column(name = "production_year", nullable = false)
    private int productionYear;
    @Column(name="running_time", nullable = false)
    private int runningTime; // In minuts
    @CreationTimestamp
    private LocalDateTime created;
    @UpdateTimestamp
    private LocalDateTime edited;

    public Movie(String title, Genres genre, int ageLimit, int productionYear, int runningTime) {
        this.title = title;
        this.genre = genre;
        this.ageLimit = ageLimit;
        this.productionYear = productionYear;
        this.runningTime = runningTime;
    }
}
