package com.kinoxp.entities;

import lombok.Getter;

@Getter
public enum Theater {

    SMALL_THEATER(20, 12),
    BIG_THEATER(25, 16);


    private int rows;
    private int numbersInRow;

    Theater(int rows, int numbersInRow) {
        this.rows = rows;
        this.numbersInRow = numbersInRow;
    }


    public void setSize(int rows, int numbersInRow){
        this.rows = rows;
        this.numbersInRow = numbersInRow;
    }


}


