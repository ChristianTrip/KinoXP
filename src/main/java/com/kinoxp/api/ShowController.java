package com.kinoxp.api;

import com.kinoxp.dto.ShowResponse;
import com.kinoxp.services.ShowService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/shows")
@CrossOrigin //giver adgang til at andre servere kan hente data herfra
public class ShowController {

    private ShowService service;

    private ShowController(ShowService service){
        this.service = service;
    }

    @GetMapping("")
    public List<ShowResponse> getAllMovies(){
        return service.getAllShows();
    }

}
