package com.kinoxp.configuration;

import com.kinoxp.entities.*;
import com.kinoxp.repositories.CustomerRepository;
import com.kinoxp.repositories.MovieRepository;
import com.kinoxp.repositories.ReservationRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class SetupTestData implements ApplicationRunner {

    private MovieRepository movieRepository;

    public SetupTestData(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public void run(ApplicationArguments args) {
        setup();
    }

    /*****************************************************************************************
     NEVER  COMMIT/PUSH CODE WITH DEFAULT CREDENTIALS FOR REAL
     iT'S ONE OF THE TOP SECURITY FLAWS YOU CAN DO
     *****************************************************************************************/

    private void setup() {
        System.out.println("******************************************************************************");
        System.out.println("*********** CREATING MOVIES FOR DB, FOR TESTING PURPOSES *********************");
        System.out.println("******************************************************************************");

        Movie movie1 = new Movie("First Blood", Genre.ACTION, 16, 1982, 93);
        Movie movie2 = new Movie("Rambo: First Blood 2", Genre.ACTION, 16, 1985, 95);

        //movieRepository.save(movie1);
        //movieRepository.save(movie2);
    }


}
