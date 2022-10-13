package com.kinoxp.api;

import com.kinoxp.dto.ReservationResponse;
import com.kinoxp.services.ReservationService;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/{seat_id}/{show_id}/{cust_id}")
    public void makeReservation(@PathVariable int seat_id, @PathVariable int show_id, @PathVariable int cust_id){

    }


}
