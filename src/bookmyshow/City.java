package bookmyshow;

public class City {

    private String city;
    private String cityCode;

    public City(String city, String cityCode) {
        this.city = city;
        this.cityCode = cityCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }
}
