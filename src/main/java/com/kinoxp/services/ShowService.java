package com.kinoxp.services;

import com.kinoxp.dto.MovieRequest;
import com.kinoxp.entities.Movie;
import com.kinoxp.entities.ShowingTimes;
import com.kinoxp.entities.Theaters;
import com.kinoxp.repositories.MovieRepository;
import com.kinoxp.repositories.ShowRepository;
import com.kinoxp.dto.ShowResponse;
import com.kinoxp.entities.Show;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ShowService {

    private ShowRepository repository;

    private MovieRepository movRepo; // --må  man godt det her?

    public ShowService(ShowRepository repository){
        this.repository = repository;
    }


    public List<ShowResponse> getAllShows(){
        List<Show> shows = repository.findAll();
        List<ShowResponse> showResponses = shows
                .stream()
                .map(show -> new ShowResponse(show, true))
                .collect(Collectors.toList());
        return showResponses;
    }

    public void editTheater(Theaters theater){

    }

    public void editShowingTime(ShowingTimes showingTime){

    }

    public void editMovie(MovieRequest body, String title){
        Movie movie = movRepo.findById(title).orElseThrow(()->  new ResponseStatusException(HttpStatus.BAD_REQUEST,"Movie not found"));
        /*
        if(!body.getTitle().equals(title)){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Cannot change movie");
        }
         */


    }

}
