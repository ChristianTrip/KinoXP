package com.kinoxp.entities;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

//----------------Lombok.
@Getter
@Setter
@NoArgsConstructor
@Builder
//----------------Lombok.

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @ManyToOne
    Customer customer;

    @CreationTimestamp
    private LocalDateTime reservationDate;

    public Reservation(int id,  Customer customer, LocalDateTime reservationDate) {
        this.id = id;
        this.customer = customer;
        this.reservationDate = reservationDate;
    }


}
