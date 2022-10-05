package com.kinoxp.dto;

import com.kinoxp.entities.Genres;
import com.kinoxp.entities.Movie;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MovieRequest {

    private int id;
    private String title;
    private Genres genre;
    private int ageLimit;
    private int productionYear;
    private int runningTime;

    public MovieRequest(String title, String genre, int ageLimit, int productionYear, int runningTime) {
        this.title = title;
        this.genre = convertStringToEnum(genre);
        this.ageLimit = ageLimit;
        this.productionYear = productionYear;
        this.runningTime = runningTime;
    }

    public static Movie getMovieEntity(MovieRequest request){
        return new Movie(request.title, request.genre, request.ageLimit, request.productionYear, request.runningTime);
    }

    private static Genres convertStringToEnum(String genreAsString){
        System.out.println("=======================================");
        System.out.println("incoming value for genre: " + genreAsString);
        System.out.println("=======================================");
        for (Genres genre : Genres.values()) {
            if (genreAsString.toUpperCase().equals(genre.name())){
                return genre;
            }
        }
        return null;
    }

}
