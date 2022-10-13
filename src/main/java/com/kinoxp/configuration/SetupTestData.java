package com.kinoxp.configuration;

import com.kinoxp.entities.Genre;
import com.kinoxp.entities.Movie;
import com.kinoxp.entities.Seat;
import com.kinoxp.repositories.MovieRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Controller;

import java.time.LocalDate;

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

        int rows1 = 20;
        int numbInRows1 = 12;

        int rows2 = 25;
        int numbInRows2 = 16;

        setupSeats(rows1, numbInRows1);
        setupSeats(rows2, numbInRows2);

        //movieRepository.save(movie1);
        //movieRepository.save(movie2);

    }


    private void setupSeats(int rows, int numbersInRow){
        for (int row = 1; row <= rows; row++) {
            for (int numbInRow = 1; numbInRow <= numbersInRow; numbInRow++) {
                //seats.add(new Seat(row, numbInRow));
            }
        }
    }

}
