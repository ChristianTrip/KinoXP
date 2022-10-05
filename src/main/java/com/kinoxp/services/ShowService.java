package com.kinoxp.services;

import com.kinoxp.entities.Movie;
import com.kinoxp.entities.ShowingTimes;
import com.kinoxp.entities.Theaters;
import com.kinoxp.repositories.ShowRepository;
import com.kinoxp.dto.ShowResponse;
import com.kinoxp.entities.Show;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ShowService {

    private ShowRepository repository;

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

    public void editMovie(Movie movie){

    }

}
