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
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ShowService {

    private ShowRepository showRepository;

    private MovieRepository movieRepository;


    public ShowService(ShowRepository showRepository, MovieRepository movieRepository){
        this.showRepository = showRepository;
        this.movieRepository = movieRepository;
    }

    public void createShow(Theater theater, ShowingTime showingTime, int movieId, LocalDate date){
        Movie currentMovie = movieRepository.findById(movieId).orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Show with this id doesn't exist"));
        Show show = new Show(theater, showingTime, currentMovie, date);
        showRepository.save(show);
    }

    public List<ShowResponse> getAllShows(boolean includeAll){
        List<Show> shows = showRepository.findAll();
        List<ShowResponse> showResponses = shows
                .stream()
                .map(show -> new ShowResponse(show, includeAll))
                .collect(Collectors.toList());
        return showResponses;
    }

    public ShowResponse getSingleShow(int showId, boolean includeAll){
        Show show = showRepository.findById(showId).orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Show with this id doesn't exist"));
        return new ShowResponse(show, includeAll);
    }

    public void editTheater(ShowRequest showRequest, int showId){
        Show show = showRepository.findById(showId).orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Show with this id doesn't exist"));
        show.setTheater(showRequest.getTheater());
        showRepository.save(show);
    }

    public void editShowingTime(ShowRequest showRequest, int showId){
        Show show = showRepository.findById(showId).orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Show with this id doesn't exist"));
        show.setShowingTime(showRequest.getShowingTime());
        showRepository.save(show);
    }

   public void editMovie(ShowRequest showRequest, int showId) {
       Show show = showRepository.findById(showId).orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Show with this id doesn't exist"));
       Movie wishedMovie = movieRepository.findById(showRequest.getMovieID()).orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Show with this id doesn't exist"));
       show.setMovie(wishedMovie);
       showRepository.save(show);
   }

    public void deleteShow(int showId){
        showRepository.deleteById(showId);
    }

}
