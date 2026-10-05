package bookmyshow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class BookMyShow {

    private HashMap<String, ArrayList<Theater>> fetchCityTheaters = new HashMap<>();
    private HashMap<String,String> fetchCityCode = new HashMap<>();
    private ArrayList<Theater> theater = new ArrayList<>();

    public BookMyShow(){

    }

    public void addCity(City city){
        fetchCityCode.put(city.getCity(),city.getCityCode());
    }

    public void addTheater(String city,Theater theaterdata){

        theater.add(theaterdata);
        for(Map.Entry<String,String> entry :fetchCityCode.entrySet()){
            String cityname = entry.getKey();
            String code = entry.getValue();
            if(Objects.equals(city, cityname)){
                fetchCityTheaters.put(code,theater);
            }
        }
    }

    public String fetchCitycode(String city){
        for(Map.Entry<String,String> entry :fetchCityCode.entrySet()){
            String cityname = entry.getKey();
            String code = entry.getValue();
            if(Objects.equals(city, cityname)){
                return code;
            }
        }

        return null;
    }

    public ArrayList<Theater> fetchTheater(String citycode){
        for(Map.Entry<String, ArrayList<Theater>> cityTheater : fetchCityTheaters.entrySet()){
            String cityC = cityTheater.getKey();
            ArrayList<Theater> listofTheaters = cityTheater.getValue();
            if(Objects.equals(cityC, citycode)){
                return listofTheaters;
            }
        }

        return null;
    }

    public void searchMovie(Theater theater,String movieName){
        Theater callTheater = null;
        callTheater.searchForMovie(theater,movieName);
    }

}
