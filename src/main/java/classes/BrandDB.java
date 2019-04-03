package classes;

import java.sql.*;
import java.util.ArrayList;

public class BrandDB {
    public static ArrayList<Brand> select(){
        ArrayList<Brand> brands = new ArrayList<>();
        try (Connection connection = Connector.getConnectToMyDbAuto()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select brand_id, name from brand");
            while (resultSet.next()) {
                Brand brand = new Brand();
                brand.setBrandId(resultSet.getInt("brand_id"));
                brand.setName(resultSet.getString("name"));
                brands.add(brand);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return brands;
    }
    @SuppressWarnings("Duplicates")
    public static Brand select(int brandId){
        Brand brand = null;
        try (Connection connection = Connector.getConnectToMyDbAuto()) {
            String sql = "select brand_id, name from brand where brand_id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, brandId);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()){
                brand = new Brand();
                brand.setBrandId(resultSet.getInt("brand_id"));
                brand.setName(resultSet.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return brand;
    }

    public static Brand selectByName(String brandName){
        Brand brand = null;
        try (Connection connection = Connector.getConnectToMyDbAuto()) {
            String sql = "select brand_id, name from brand where name = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, brandName);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()){
                brand = new Brand();
                brand.setBrandId(resultSet.getInt("brand_id"));
                brand.setName(resultSet.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return brand;
    }
}
