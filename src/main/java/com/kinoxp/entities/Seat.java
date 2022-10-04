package com.kinoxp.entities;

public class Seat {

    private int id;
    private boolean reserved = false;

    private int row;
    private int numbInRow;

    public Seat(int row, int numbInRow) {
        this.row = row;
        this.numbInRow = numbInRow;
    }

    public void reserveSeat(){
        this.reserved = true;
    }

    public int getId() {
        return id;
    }

    public boolean isReserved() {
        return reserved;
    }

    @Override
    public String toString() {
        return "Kino.Seat{" +
                "id=" + id +
                ", reserved=" + reserved +
                ", row=" + row +
                ", numbInRow=" + numbInRow +
                '}';
    }
}
