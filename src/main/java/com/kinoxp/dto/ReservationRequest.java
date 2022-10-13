package com.kinoxp.dto;

import com.kinoxp.entities.Reservation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReservationRequest {

    private int showId;
    private String customerEmail;
    private LocalDate reservationDate;

    private List<Integer> seat_ids;



    public ReservationRequest(Reservation reservation) {
        this.showId = reservation.getId();
        this.customerEmail = reservation.getCustomer().getEmail();
        this.reservationDate = reservation.getReservationDate();
    }
}
