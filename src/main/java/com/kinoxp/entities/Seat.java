package com.kinoxp.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="seats")
public class Seat {

    @Id
    private int id;
    @Column(name = "seat_row")
    private int row;
    private int numbInRow;

    private boolean reserved;

    @ManyToOne
    private Reservation reservation;

    public Seat(int row, int numbInRow) {
        this.row = row;
        this.numbInRow = numbInRow;
        this.reserved = false;
    }


}
