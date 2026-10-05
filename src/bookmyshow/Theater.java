package bookmyshow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class Theater {

    private String TheaterName;
    private String theaterId ;

    public Show show;

    private HashMap<String, ArrayList<Show>> showTime = new HashMap<>();

    public Theater(String theaterName) {
        TheaterName = theaterName;
        this.theaterId = String.valueOf(UUID.randomUUID());
    }

    public String getTheaterId() {
        return theaterId;
    }

    public String getTheaterName() {
        return TheaterName;
    }

    public void setTheaterName(String theaterName) {
        TheaterName = theaterName;
    }

    public void searchForMovie(Theater theater,String movieName){

    }
}
