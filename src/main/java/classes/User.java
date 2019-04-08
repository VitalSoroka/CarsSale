package classes;

import java.io.Serializable;
import java.sql.*;
import java.util.ArrayList;

public class User  implements Serializable {
    private int userId;
    private String name;
    private String lastname;
    private int accountId;

    public User(){}

    public User(String name, String lastame){
        this.lastname = lastame;
        this.name = name;
    }

    public User(String name, String lastname, int accountId) {
        this.name = name;
        this.lastname = lastname;
        this.accountId = accountId;
    }

    public int getUserId() {
        return userId;
    }

    public String getLastname() {
        return lastname;
    }

    public String getName() {
        return name;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setLastname(String lastame) {
        this.lastname = lastame;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    @SuppressWarnings("Duplicates")
    public static ArrayList<User> select() {
        ArrayList<User> users = new ArrayList<>();
        try (Connection connection = Connector.getConnectToMyDbAuto()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select user_id, name , lastname, account_id from user");
            while (resultSet.next()) {
                User user = new User();
                user.setUserId(resultSet.getInt("user_id"));
                user.setName(resultSet.getString("name"));
                user.setLastname(resultSet.getString("lastname"));
                user.setAccountId(resultSet.getInt("account_id"));
                users.add(user);
                System.out.println("запрос пользователей прошел успешно!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }
    @SuppressWarnings("Duplicates")
    public static User select(int accountId){
        User user = null;
        try (Connection connection = Connector.getConnectToMyDbAuto()) {
            String sql = "select  user_id, name, lastname, account_id from user where account_id = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, accountId);
                ResultSet resultSet = statement.executeQuery();
                if(resultSet.next()){
                    user = new User();
                    user.setUserId(resultSet.getInt("user_id"));
                    user.setName(resultSet.getString("name"));
                    user.setLastname(resultSet.getString("lastname"));
                    user.setAccountId(resultSet.getInt("account_id"));
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;

    }


    public static int insert(User user){
        try (Connection connection = Connector.getConnectToMyDbAuto()) {
            String sql = "insert into user (name, lastname, account_id) values (?,?,?)";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, user.getName());
                statement.setString(2, user.getLastname());
                statement.setInt(3,user.getAccountId());
                return statement.executeUpdate();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;

    }

    public static int update(User user){
        try (Connection connection = Connector.getConnectToMyDbAuto()) {
            String sql = "update user set name = ?, lastname = ? where user_id = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, user.getName());
                statement.setString(2, user.getLastname());
                statement.setInt(3, user.getUserId());
                return statement.executeUpdate();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }


    public static int delele(int userId){
        try (Connection connection = Connector.getConnectToMyDbAuto()) {
            String sql = "delete from user where user_id = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, userId);
                return statement.executeUpdate();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
