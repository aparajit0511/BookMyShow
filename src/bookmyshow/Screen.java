package bookmyshow;

public class Screen {

    private String screenName;
    private int totalSeats;

    public Screen(String screenName) {
        this.screenName = screenName;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public int getTotalSeats() {
        return totalSeats;
    }
}
