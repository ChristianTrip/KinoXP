package com.kinoxp.entities;

import com.kinoxp.dto.ShowResponse;
import com.kinoxp.repositories.MovieRepository;
import com.kinoxp.repositories.ShowRepository;
import com.kinoxp.services.ShowService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class ShowServiceTest {

    @Mock
    private ShowRepository showRepositoryMock;
    @Mock
    private MovieRepository movieRepositoryMock;
    @Autowired
    private ShowService showService;

    @BeforeEach
    public void setup(){
        showService = new ShowService(showRepositoryMock, movieRepositoryMock);
    }

    @Test
    void getAllShows(){
        Mockito.when(showRepositoryMock.findAll()).thenReturn(List.of(
                new Show(Theater.SMALL_THEATER,ShowingTime.MORNING,new Movie("Rambo: First Blood Part II",Genre.ACTION,18,1985,96),LocalDate.now()),
                new Show(Theater.BIG_THEATER,ShowingTime.AFTER_NOON,new Movie("Up",Genre.ACTION,6,2009,96),LocalDate.now()),
                new Show(Theater.BIG_THEATER,ShowingTime.NIGHT,new Movie("It",Genre.ACTION,18,2017,135),LocalDate.now())
        ));
        List<ShowResponse> shows = showService.getAllShows();
        assertEquals(3, shows.size());
    }


    @Test
    void getSingleShow() throws Exception{
        Show show = new Show(Theater.BIG_THEATER,ShowingTime.EVENING,new Movie("E.T",Genre.ACTION,12,1982,105),LocalDate.now());
        show.setId(5L);
        Mockito.when(showRepositoryMock.findById(5L)).thenReturn(Optional.of(show));
        ShowResponse response = showService.getSingleShow(5L);

        assertEquals("E.T", response.getMovie().getTitle());
    }

}