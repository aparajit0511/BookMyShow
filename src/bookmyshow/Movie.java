package bookmyshow;

import java.util.UUID;

public class Movie {
    private String movieName;
    private String movieId;

    public Movie(String movieName) {
        this.movieName = movieName;
        this.movieId = String.valueOf(UUID.randomUUID());
    }

    public String getMovieId() {
        return movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
}
