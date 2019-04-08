import classes.*;

import javax.servlet.ServletOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = UserDB.select();
        for (User user : users) {
            System.out.println(user.getName());
        }
        Auto auto = AutoDB.select(10);
        auto.setNameModel("model");
        try(Connection  connection = Connector.getConnectToMyDbAuto()) {
            String sql = "update auto set year_of_issue=?, name_model=?, cost=?, color=?," +
                    " mileage=?, type_fuel=?, engine_power=?, engine_volume=?, drive_unit=?, transmission=?," +
                    " user_id=?, brand_id=? where auto_id=?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, auto.getYearOfIssue());
            statement.setString(2, auto.getNameModel());
            statement.setDouble(3, auto.getCost());
            statement.setString(4, auto.getColor());
            statement.setInt(5, auto.getMileage());
            statement.setString(6, auto.getTypeFuel());
            statement.setInt(7, auto.getEnginePower());
            statement.setDouble(8, auto.getEngineVolume());
            statement.setString(9, auto.getDriveUnit());
            statement.setString(10, auto.getTransmission());
            statement.setInt(11, auto.getUserId());
            statement.setInt(12, auto.getBrandId());
            statement.setInt(13, auto.getAutoId());
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
