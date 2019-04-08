package classes;

import java.io.Serializable;

public class Phone implements Serializable {
    private int phoneId;
    private String number;
    private int userId;

    public Phone(String number, int userId) {
        this.number = number;
        this.userId = userId;
    }

    public Phone() {
    }

    public int getPhoneId() {
        return phoneId;
    }

    public String getNumber() {
        return number;
    }

    public int getUserId() {
        return userId;
    }

    public void setPhoneId(int phoneId) {
        this.phoneId = phoneId;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

}
