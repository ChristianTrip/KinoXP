package com.kinoxp.api;

import com.kinoxp.dto.ShowRequest;
import com.kinoxp.dto.ShowResponse;
import com.kinoxp.services.ShowService;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(path = "/{showId}")
    public ShowResponse getSingleMovie(@PathVariable int showId){
        return service.getSingleShow(showId);
    }

    @PostMapping
    public ShowResponse createShow(@RequestBody ShowRequest body){
        return service.createShow(body.getTheater(), body.getShowingTime(), body.getMovie());
    }

    @PutMapping("/show/{showId}/{theater}/{showingTime}/{movie}")
    public void editShow(@RequestBody ShowRequest body, @PathVariable int showId) {
        service.editTheater(body, showId);
        service.editShowingTime(body, showId);
        service.editMovie(body, showId);
    }

    @PatchMapping("/theater/{showId}/{theater}")
    public void editTheater(@RequestBody ShowRequest body, @PathVariable int showId) {
        service.editTheater(body, showId);
    }

    @PatchMapping("/showing-time/{showId}/{showingTime}")
    public void editShowingTime(@RequestBody ShowRequest body, @PathVariable int showId) {
        service.editShowingTime(body, showId);
    }

    @PatchMapping("/movie/{showId}/{movie}")
    public void editMovie(@RequestBody ShowRequest body, @PathVariable int showId) {
        service.editMovie(body, showId);
    }

    @DeleteMapping("/{showId}")
    public void deleteShow(@PathVariable int showId) {
        service.deleteShow(showId);
    }


}
