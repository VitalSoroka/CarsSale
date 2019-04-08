package classes;

import java.sql.*;
import java.util.ArrayList;

public class AccountDB {
    public static ArrayList<Account> select(){
        ArrayList<Account> accounts = new ArrayList<>();
        try (Connection connection = Connector.getConnectToMyDbAuto()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select account_id, login, password from account");
            while (resultSet.next()) {
                Account account = new Account();
                account.setAccountId(resultSet.getInt("account_id"));
                account.setLogin(resultSet.getString("login"));
                account.setPassword(resultSet.getString("password"));
                accounts.add(account);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return accounts;
    }

    public static Account select(int accountId){
        Account account = null;
        try (Connection connection = Connector.getConnectToMyDbAuto()) {
            String sql = "select account_id, login,password from account where account_id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, accountId);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()){
                account = new Account();
                account.setAccountId(resultSet.getInt("account_id"));
                account.setLogin(resultSet.getString("login"));
                account.setPassword(resultSet.getString("password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return account;
    }

    public static Account selectByLogin(String login){
        Account account = null;
        try (Connection connection = Connector.getConnectToMyDbAuto()) {
            String sql = "select account_id, login,password from account where login = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, login);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()){
                account = new Account();
                account.setAccountId(resultSet.getInt("account_id"));
                account.setLogin(resultSet.getString("login"));
                account.setPassword(resultSet.getString("password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return account;
    }

    public static int insert(Account account){

        try (Connection connection = Connector.getConnectToMyDbAuto()) {
            String sql = "insert into account(login, password) values(?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, account.getLogin());
            statement.setString(2, account.getPassword());
            return statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static int delele(String login){

        try (Connection connection = Connector.getConnectToMyDbAuto()) {
            String sql = "delete from account where login = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, login);
            return statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static int delele(int account_id){

        try (Connection connection = Connector.getConnectToMyDbAuto()) {
            String sql = "delete from account where account_id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, account_id);
            return statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

}
