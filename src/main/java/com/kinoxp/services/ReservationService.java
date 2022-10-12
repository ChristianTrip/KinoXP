package com.kinoxp.services;

import com.kinoxp.dto.ReservationResponse;
import com.kinoxp.entities.Reservation;
import com.kinoxp.repositories.ReservationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReservationService {

    private ReservationRepository repository;

    public ReservationService(ReservationRepository repository) {
        this.repository = repository;
    }

    public List<ReservationResponse> getAllReservations(){
        List<Reservation> reservations = repository.findAll();
        List<ReservationResponse> movieResponses = reservations
                .stream()
                .map(reservation -> new ReservationResponse(reservation))
                .collect(Collectors.toList());
        return movieResponses;
    }

}
