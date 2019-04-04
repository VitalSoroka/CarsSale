import classes.AutoDB;
import classes.User;
import classes.UserDB;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = UserDB.select();
        for (User user : users) {
            System.out.println(user.getName());
        }
        System.out.println(AutoDB.select(1).getBrandId());
    }
}
