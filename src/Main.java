import bookmyshow.*;

import java.time.LocalTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println("BookMyShow");

        City city1 = new City("Bangalore","BLR100");
        City city2 = new City("Mumbai","MUM100");

        Theater pvr = new Theater("PVR");
        Theater inox = new Theater("Inox");

        Screen screen1 = new Screen("Screen1");
        Screen screen2 = new Screen("Screen2");
        Screen screen3 = new Screen("Screen3");

        Show show1 = new Show("Dune",screen1,20, LocalTime.of(9,00),LocalTime.of(10,30));
        Show show2 = new Show("Spiderman",screen1,20, LocalTime.of(10,30),LocalTime.of(12,30));
        Show show3 = new Show("6Sense",screen2,20, LocalTime.of(9,00),LocalTime.of(11,30));
        Show show4 = new Show("Dune",screen3,20, LocalTime.of(10,00),LocalTime.of(11,30));
        Show show5 = new Show("Spiderman",screen1,20, LocalTime.of(14,00),LocalTime.of(16,30));

        User user1 = new User("Aparajit");
        User user2 = new User("Chatterjee");

        BookMyShow bookmyshow = new BookMyShow();
        bookmyshow.addCity(city1);
        bookmyshow.addTheater("Bangalore",pvr);
        bookmyshow.addTheater("Bangalore",inox);

        String citycode = bookmyshow.fetchCitycode("Bangalore");

      if(citycode != null){
          ArrayList<Theater> theater = bookmyshow.fetchTheater(citycode);
          System.out.println("List of Theaters"+ theater);

          bookmyshow.searchMovie(pvr,"Dune");
      }

    }
}