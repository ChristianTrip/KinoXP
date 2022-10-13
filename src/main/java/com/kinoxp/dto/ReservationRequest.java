package com.kinoxp.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kinoxp.entities.Movie;
import com.kinoxp.entities.Reservation;
import com.kinoxp.entities.Show;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReservationRequest {

    private int showId;
    private String customerEmail;
    private List<Integer> seatIds;


    public ReservationRequest(Reservation reservation) {
        this.showId = reservation.getId();
        this.customerEmail = reservation.getCustomer().getEmail();
        this.seatIds = reservation.getSeats().stream().map(seat -> seat.getId()).collect(Collectors.toList());
    }

}
