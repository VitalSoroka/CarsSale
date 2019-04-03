package classes;

import java.sql.*;
import java.util.ArrayList;

public class TypeAutoDB {
    public static ArrayList<TypeAuto> select(){
        ArrayList<TypeAuto> typeAutos = new ArrayList<>();
        try (Connection connection = Connector.getConnectToMyDbAuto()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select type_auto_id, name from type_auto");
            while (resultSet.next()) {
                TypeAuto typeAuto = new TypeAuto();
                typeAuto.setTypeAutoId(resultSet.getInt("type_auto_id"));
                typeAuto.setName(resultSet.getString("name"));
                typeAutos.add(typeAuto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return typeAutos;
    }

    public static TypeAuto select(int typeAutoId){
        TypeAuto typeAuto = null;
        try (Connection connection = Connector.getConnectToMyDbAuto()) {
            String sql = "select type_auto_id, name from type_auto where  type_auto_id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, typeAutoId);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()){
                typeAuto = new TypeAuto();
                typeAuto.setTypeAutoId(resultSet.getInt("type_auto_id"));
                typeAuto.setName(resultSet.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return typeAuto;
    }

    public static TypeAuto selectByName(String name){
        TypeAuto typeAuto = null;
        try (Connection connection = Connector.getConnectToMyDbAuto()) {
            String sql = "select type_auto_id, name from type_auto where  name = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, name);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()){
                typeAuto = new TypeAuto();
                typeAuto.setTypeAutoId(resultSet.getInt("type_auto_id"));
                typeAuto.setName(resultSet.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return typeAuto;
    }
}
