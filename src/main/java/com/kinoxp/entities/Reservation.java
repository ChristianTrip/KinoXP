package com.kinoxp.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Table(name="reservations")
@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne (cascade = CascadeType.ALL)
    @Column(name = "customer_id")
    private Customer customer;

    @OneToMany
    private List<Seat> seats;

    @ManyToOne
    @Column(name = "show_id")
    private Show show;

    @CreationTimestamp
    private LocalDate reservationDate;

    @CreationTimestamp
    LocalDateTime created;
    @UpdateTimestamp
    LocalDateTime edited;

    public Reservation(int id, Customer customer, List<Seat> seats, Show show, LocalDate reservationDate, LocalDateTime created, LocalDateTime edited) {
        this.id = id;
        this.customer = customer;
        this. show = show;
        this.seats = seats;
        this.reservationDate = reservationDate;
        this.created = created;
        this.edited = edited;
    }
}
