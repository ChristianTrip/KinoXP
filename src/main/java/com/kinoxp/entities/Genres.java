package com.kinoxp.entities;

import javax.persistence.Enumerated;

public enum Genres {

    HORROR,
    COMEDY,
    ROMANCE,
    ACTION;

    public void print(){
        System.out.println("hello from Genres");
    }
}
