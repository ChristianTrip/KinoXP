package com.kinoxp.dto;

import com.kinoxp.entities.Reservation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReservationRequest {

    private int showId;
    private String customerEmail;
    private LocalDate reservationDate;



    public ReservationRequest(Reservation reservation) {
        this.showId = reservation.getId();
        this.customerEmail = reservation.getCustomer().getEmail();
        this.reservationDate = reservation.getReservationDate();
    }
}
