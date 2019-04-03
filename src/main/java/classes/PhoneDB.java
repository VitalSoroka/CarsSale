package classes;

import java.sql.*;
import java.util.ArrayList;

public class PhoneDB {
    public static ArrayList<Phone> select() {
        ArrayList<Phone> phones = new ArrayList<>();
        try (Connection connection = Connector.getConnectToMyDbAuto()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select phone_id, number, user_id from phone");
            while (resultSet.next()) {
                Phone phone = new Phone();
                phone.setPhoneId(resultSet.getInt("phone_id"));
                phone.setNumber(resultSet.getString("number"));
                phone.setUserId(resultSet.getInt("user_id"));
                phones.add(phone);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return phones;
    }

    public static Phone selectByUserId(int userId){
        Phone phone = null;
        try (Connection connection = Connector.getConnectToMyDbAuto()) {
            String sql = "select phone_id, number, user_id from phone where  user_id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, userId);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()){
                phone = new Phone();
                phone.setPhoneId(resultSet.getInt("phone_id"));
                phone.setNumber(resultSet.getString("number"));
                phone.setUserId(resultSet.getInt("user_id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return phone;
    }

    public static int insert(Phone phone){
        try (Connection connection = Connector.getConnectToMyDbAuto()) {
            String sql = "insert into phone(number, user_id) values (?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, phone.getNumber());
            statement.setInt(2, phone.getUserId());
            return statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static int update(Phone phone){
        try (Connection connection = Connector.getConnectToMyDbAuto()) {
            String sql = "update phone set number = ? where phone_id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, phone.getNumber());
            statement.setInt(2, phone.getPhoneId());
            return statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static int delete(int phoneId){
        try (Connection connection = Connector.getConnectToMyDbAuto()) {
            String sql = "delete from phone where phone_id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, phoneId);
            return statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static int deleteByUserId(int userId){

        try (Connection connection = Connector.getConnectToMyDbAuto()) {
            String sql = "delete from phone where user_id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, userId);
            return statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0;

    }
}
