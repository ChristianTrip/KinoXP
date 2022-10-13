package com.kinoxp.entities;

import java.util.ArrayList;
import java.util.List;

public enum Theater {

    SMALL_THEATER (20, 12),
    BIG_THEATER(25, 16);

    private List<Seat> seats = new ArrayList<>();
    private int rows;
    private int numbersInRow;

    private Theater(int rows, int numbersInRow){
        this.rows = rows;
        setupSeats(rows, numbersInRow);
    }

    private void setupSeats(int rows, int numbersInRow){
        for (int row = 1; row <= rows; row++) {
            for (int numbInRow = 1; numbInRow <= numbersInRow; numbInRow++) {
                seats.add(new Seat(row, numbInRow));
            }
        }
    }

    public List<Seat> getSeats(){
        return seats;
    }


}
