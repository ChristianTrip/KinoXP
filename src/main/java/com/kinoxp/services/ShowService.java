package com.kinoxp.services;

import com.kinoxp.dto.ShowRequest;
import com.kinoxp.entities.Movie;
import com.kinoxp.entities.ShowingTime;
import com.kinoxp.entities.Theater;
import com.kinoxp.repositories.MovieRepository;
import com.kinoxp.repositories.ShowRepository;
import com.kinoxp.dto.ShowResponse;
import com.kinoxp.entities.Show;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ShowService {

    private ShowRepository repository;

    private MovieRepository movRepo; // --må  man godt det her?


    public ShowService(ShowRepository repository, MovieRepository movRepo){
        this.repository = repository;
        this.movRepo = movRepo;
    }

    public void createShow(Theater theater, ShowingTime showingTime, Long movieId, LocalDate date){
        Movie currentMovie = movRepo.findById(movieId).orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Show with this id doesn't exist"));
        Show show = new Show(theater, showingTime, currentMovie, date);
        repository.save(show);
    }

    public List<ShowResponse> getAllShows(boolean includeAll){
        List<Show> shows = repository.findAll();
        List<ShowResponse> showResponses = shows
                .stream()
                .map(show -> new ShowResponse(show, includeAll))
                .collect(Collectors.toList());
        return showResponses;
    }

    public ShowResponse getSingleShow(Long showId, boolean includeAll){
        Show show = repository.findById(showId).orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Show with this id doesn't exist"));
        return new ShowResponse(show, includeAll);
    }

    public void editTheater(ShowRequest showRequest, Long showId){
        Show show = repository.findById(showId).orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Show with this id doesn't exist"));
        show.setTheater(showRequest.getTheater());
        repository.save(show);
    }

    public void editShowingTime(ShowRequest showRequest, Long showId){
        Show show = repository.findById(showId).orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Show with this id doesn't exist"));
        show.setShowingTime(showRequest.getShowingTime());
        repository.save(show);
    }

   public void editMovie(ShowRequest showRequest, Long showId) {
       Show show = repository.findById(showId).orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Show with this id doesn't exist"));
       Movie wishedMovie = movRepo.findById(showRequest.getMovieID()).orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Show with this id doesn't exist"));
       show.setMovie(wishedMovie);
       repository.save(show);
   }

    public void deleteShow(Long showId){
        repository.deleteById(showId);
    }

}
