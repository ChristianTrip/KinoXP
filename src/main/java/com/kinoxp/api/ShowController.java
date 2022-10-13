package com.kinoxp.api;

import com.kinoxp.dto.ShowRequest;
import com.kinoxp.dto.ShowResponse;
import com.kinoxp.services.ShowService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shows")
@CrossOrigin
public class ShowController {

    private ShowService service;

    private ShowController(ShowService service){
        this.service = service;
    }

    @GetMapping("")
    public List<ShowResponse> getAllMovies(){
        return service.getAllShows(false);
    }

    @GetMapping(path = "/{showId}")
    public ShowResponse getSingleMovie(@PathVariable Long showId){
        return service.getSingleShow(showId, false);
    }

    @PostMapping
    public void createShow(@RequestBody ShowRequest body){
        service.createShow(body.getTheater(), body.getShowingTime(), body.getMovieID(), body.getDate());
    }

    @PutMapping("/{showId}/{theater}/{showingTime}/{movieID}")
    public void editShow(@RequestBody ShowRequest body, @PathVariable Long showId) {
        service.editTheater(body, showId);
        service.editShowingTime(body, showId);
        service.editMovie(body, showId);
    }

    @PatchMapping("/theater/{showId}/{theater}")
    public void editTheater(@RequestBody ShowRequest body, @PathVariable Long showId) {
        service.editTheater(body, showId);
    }

    @PatchMapping("/showing-time/{showId}/{showingTime}")
    public void editShowingTime(@RequestBody ShowRequest body, @PathVariable Long showId) {
        service.editShowingTime(body, showId);
    }

    @PatchMapping("/movie/{showId}/{movie}")
    public void editMovie(@RequestBody ShowRequest body, @PathVariable Long showId) {
        service.editMovie(body, showId);
    }

    @DeleteMapping("/{showId}")
    public void deleteShow(@PathVariable Long showId) {
        service.deleteShow(showId);
    }


}
