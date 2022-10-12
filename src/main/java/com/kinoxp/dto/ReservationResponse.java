package com.kinoxp.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.kinoxp.entities.Customer;
import com.kinoxp.entities.Reservation;
import com.kinoxp.entities.Seat;
import com.kinoxp.entities.Show;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReservationResponse {


    private int id;
    private Customer customer;
    private Show show;
    private List<Seat> seats;
    private LocalDate reservationDate;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss",shape = JsonFormat.Shape.STRING)
    private LocalDateTime created;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss",shape = JsonFormat.Shape.STRING)
    private LocalDateTime edited;

    public ReservationResponse(Reservation reservation) {
        this.id = reservation.getId();
        this.customer = reservation.getCustomer();
        this.show = reservation.getShow();
        this.seats = reservation.getSeats();
        this.reservationDate = reservation.getReservationDate();
        this.created = created;
        this.edited = edited;
    }
}
