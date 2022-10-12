package com.kinoxp.entities;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

//---------------Lombok.
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@AllArgsConstructor
@ToString
//---------------Lombok.
@Builder
@Table(name="movies")
@Entity //--Et object som vi skal burger i DB-tabel. Fortæller Der skal laves en table af samme navn some object.
public class Movie {
    //---------------Fields / attributter.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "genre", nullable = false)
    private Genre genre;
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
    //---------------Fields / attributter.


    public Movie(String title, Genre genre, int ageLimit, int productionYear, int runningTime) {

        this.title = title;
        this.genre = genre;
        this.ageLimit = ageLimit;
        this.productionYear = productionYear;
        this.runningTime = runningTime;
    }
    //---------------Constructor. Vi skal have en fordi vi bruger DTO klasser.
}
