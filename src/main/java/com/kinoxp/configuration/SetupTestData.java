package com.kinoxp.configuration;

import com.kinoxp.entities.Genre;
import com.kinoxp.entities.Movie;
import com.kinoxp.repositories.MovieRepository;
import com.kinoxp.repositories.ShowRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Controller;

@Controller
public class SetupTestData implements ApplicationRunner {

    private MovieRepository movieRepository;
    private ShowRepository showRepository;

    //private CustomerRepository customerRepository;
    //private ReservationRepository reservationRepository;

    public SetupTestData(MovieRepository movieRepository, ShowRepository showRepository) {
        this.movieRepository = movieRepository;
        this.showRepository = showRepository;
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
        Movie movie2 = new Movie("First Blood", Genre.ACTION, 16, 1982, 93);

        movieRepository.save(movie1);
        movieRepository.save(movie2);

    }

}
