package com.kinoxp.services;

import com.kinoxp.entities.Seat;
import com.kinoxp.entities.Theaters;

import java.util.ArrayList;
import java.util.List;

public class TheaterService {


    public void reserveSeat(Theaters theater, int index){
        theater.getSeats().get(index).reserveSeat();
    }

    public List<Seat> getAllSeats(Theaters theater){
        return theater.getSeats();
    }

    public List<Seat> getReservedSeats(Theaters theater){
        List<Seat> reservedSeats = new ArrayList<>();
        for (Seat seat : theater.getSeats()){
            if (seat.isReserved()){
                reservedSeats.add(seat);
            }
        }
        return reservedSeats;
    }

    public List<Seat> getAvailableSeats(Theaters theater){
        List<Seat> availableSeats = new ArrayList<>();
        for (Seat seat : theater.getSeats()){
            if (!seat.isReserved()){
                availableSeats.add(seat);
            }
        }
        return availableSeats;
    }

}
