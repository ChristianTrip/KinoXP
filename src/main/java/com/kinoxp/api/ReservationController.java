package com.kinoxp.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reservation")
@CrossOrigin //giver adgang til at andre servere kan hente data herfra
public class ReservationController {
}
