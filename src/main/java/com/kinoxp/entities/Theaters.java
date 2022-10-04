package com.kinoxp.entities;

import java.util.ArrayList;
import java.util.List;

public enum Theaters {

    SMALL_THEATER (20, 12),
    BIG_THEATER(25, 16);

    private List<Seat> seats = new ArrayList<>();
    private int rows;
    private int numbersInRow;

    private Theaters(int rows, int numbersInRow){
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

    public void reserveSeat(int index){
        seats.get(index).reserveSeat();
    }

    public static void viewAllSeats(Theaters theater){
        for (Seat seat : theater.seats){
            System.out.println(seat);
        }
    }

    public static void viewReservedSeats(Theaters theater){
        for (Seat seat : theater.seats){
            if (seat.isReserved()){
                System.out.println(seat);
            }
        }
    }

    public static void viewAvailableSeats(Theaters theater){
        for (Seat seat : theater.seats){
            if (!seat.isReserved()){
                System.out.println(seat);
            }
        }
    }
}
