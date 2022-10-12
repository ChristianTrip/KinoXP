package com.kinoxp.api;

import com.kinoxp.dto.ReservationResponse;
import com.kinoxp.services.ReservationService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/reservations")
@CrossOrigin //giver adgang til at andre servere kan hente data herfra
public class ReservationController {


    private ReservationService service;

    public ReservationController(ReservationService service) {
        this.service = service;
    }



    @GetMapping("")
    public List<ReservationResponse> getReservations(){
        return service.getAllReservations();
    }
}
