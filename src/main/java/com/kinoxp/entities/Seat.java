package com.kinoxp.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Seat {


    @Id
    private int id;
    @Column(name = "seat_row")
    private int row;
    private int numbInRow;

    public Seat(int row, int numbInRow) {
        this.row = row;
        this.numbInRow = numbInRow;
    }

}
