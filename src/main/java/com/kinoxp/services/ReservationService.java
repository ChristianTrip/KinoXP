package com.kinoxp.services;

import com.kinoxp.dto.ReservationRequest;
import com.kinoxp.dto.ReservationResponse;
import com.kinoxp.entities.Customer;
import com.kinoxp.entities.Reservation;
import com.kinoxp.entities.Seat;
import com.kinoxp.entities.Show;
import com.kinoxp.repositories.CustomerRepository;
import com.kinoxp.repositories.ReservationRepository;
import com.kinoxp.repositories.ShowRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReservationService {

    private ReservationRepository reservationRepository;
    private ShowRepository showRepository;
    private CustomerRepository customerRepository;

    public ReservationService(ReservationRepository reservationRepository, ShowRepository showRepository, CustomerRepository customerRepository) {
        this.reservationRepository = reservationRepository;
        this.showRepository = showRepository;
        this.customerRepository = customerRepository;
    }

    public List<ReservationResponse> getAllReservations(){
        List<Reservation> reservations = reservationRepository.findAll();
        List<ReservationResponse> reservationResponses = reservations
                .stream()
                .map(reservation -> new ReservationResponse(reservation))
                .collect(Collectors.toList());
        return reservationResponses;
    }


    public boolean addReservation(ReservationRequest request){



        Show show = showRepository.findById(request.getShowId()).orElseThrow(
                        () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "No show with this id"));

        List<Integer> showSeatIds = show.getSeats().stream().map(seat -> seat.getId()).collect(Collectors.toList());
        Customer customer = customerRepository.findById(request.getCustomerEmail()).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "No customer with this email"));
        List<Integer> seatIds = request.getSeatIds();
        List<Seat> seats = null;


        Reservation reservation = new Reservation(customer, seats, show);
        reservationRepository.save(reservation);

        return true;

    }

}
