package bookmyshow;

import java.util.UUID;

public class User {
    private String userName;
    private String userId;

    public User(String userName) {
        this.userName = userName;
        this.userId = String.valueOf(UUID.randomUUID());
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
