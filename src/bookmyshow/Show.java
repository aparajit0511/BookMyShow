package bookmyshow;

import java.time.LocalTime;
import java.util.UUID;

public class Show {
    private String showId;
    private String movieName;
    public  Screen screen;
    private int seatsAvailable;
    private LocalTime startTime;
    private LocalTime endTime;

    public Show(String movieName, Screen screen, int seatsAvailable, LocalTime startTime, LocalTime endTime) {
        this.showId = String.valueOf(UUID.randomUUID());
        this.movieName = movieName;
        this.screen = screen;
        this.seatsAvailable = seatsAvailable;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getShowId() {
        return showId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public int getSeatsAvailable() {
        return seatsAvailable;
    }

    public void setSeatsAvailable(int seatsAvailable) {
        this.seatsAvailable = seatsAvailable;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }
}
