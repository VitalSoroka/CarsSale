package classes;

import java.sql.*;
import java.util.ArrayList;

public class AutoDB {
    public static ArrayList<Auto> select(){
        ArrayList<Auto> autos = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection connection = Connector.getConnectToMyDbAuto()) {
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("select auto_id, year_of_issue, name_model, cost," +
                        " color, mileage, type_fuel, engine_power, engine_volume, drive_unit, transmission, user_id, " +
                        "type_auto_id, brand_id " +
                        "from auto");
                autos = getAutosOfResultSet(resultSet);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return autos;
    }

    public static Auto select(int autoId){
        Auto auto = null;
        try (Connection connection = Connector.getConnectToMyDbAuto()) {
            String sql = "select auto_id, year_of_issue, name_model, cost, color, mileage, type_fuel, engine_power," +
                    " engine_volume, drive_unit, transmission, user_id, type_auto_id, brand_id " +
                    "from auto where auto_id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, autoId);
            ResultSet resultSet = statement.executeQuery();
            ArrayList<Auto> autos = getAutosOfResultSet(resultSet);
            if(autos.size() > 0){
                auto = (getAutosOfResultSet(resultSet)).get(0);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return auto;
    }

    public static int getRowCount(){
        int count = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection connection = Connector.getConnectToMyDbAuto()) {
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("select count(*) from auto");
                count = resultSet.getInt(1);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return count;
    }

    public static ArrayList<Auto> select(int offset, int rowCount){
        ArrayList<Auto> autos = new ArrayList<>();
        String sql =  "select auto_id, year_of_issue, name_model, cost," +
                " color, mileage, type_fuel, engine_power, engine_volume, drive_unit, transmission, user_id, " +
                "type_auto_id, brand_id " +
                "from auto limit ?, ?";
        try (Connection connection = Connector.getConnectToMyDbAuto()) {
            if(offset < getRowCount()){
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setInt(1, offset);
                statement.setInt(2, rowCount);
                ResultSet resultSet = statement.executeQuery();
                autos = getAutosOfResultSet(resultSet);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return autos;
    }



    public static ArrayList<Auto> selectByUserId(int userId){
        ArrayList<Auto> autos = new ArrayList<>();
        try (Connection connection = Connector.getConnectToMyDbAuto()) {
            String sql = "select auto_id, year_of_issue, name_model, cost, color, mileage, type_fuel, engine_power," +
                    " engine_volume, drive_unit, transmission, user_id, type_auto_id, brand_id " +
                    "from auto where user_id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, userId);
            ResultSet resultSet = statement.executeQuery();
            autos = getAutosOfResultSet(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return autos;
    }

    @SuppressWarnings("Duplicates")
    public static int insert(Auto auto){
        try (Connection connection = Connector.getConnectToMyDbAuto()) {
            String sql = "insert into auto (auto_id, year_of_issue, name_model, cost, color, mileage, type_fuel," +
                    " engine_power, engine_volume, drive_unit, transmission, user_id, type_auto_id, brand_id)" +
                    "values (?,?,?,?,?,?,?,?,?,?, ?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, auto.getAutoId());
            statement.setInt(2, auto.getYearOfIssue());
            statement.setString(3, auto.getNameModel());
            statement.setFloat(4, auto.getCost());
            statement.setString(5, auto.getColor());
            statement.setInt(6, auto.getMileage());
            statement.setString(7, auto.getTypeFuel());
            statement.setInt(8, auto.getEnginePower());
            statement.setFloat(9, auto.getEngineVolume());
            statement.setString(10, auto.getDriveUnit());
            statement.setString(11, auto.getTransmission());
            statement.setInt(12, auto.getUserId());
            statement.setInt(13, auto.getTypeAutoId());
            statement.setInt(14, auto.getBrandId());
            return statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @SuppressWarnings("Duplicates")
    public static int update(Auto auto){
        try (Connection connection = Connector.getConnectToMyDbAuto()) {
            String sql = "update auto set auto_id = ?, year_of_issue = ?, name_model = ?, cost= ?, color = ?," +
                    " mileage = ?, type_fuel = ?, engine_power = ?, engine_volume = ?, drive_unit = ?, transmission = ?," +
                    " user_id = ?, type_auto_id = ?, brand_id = ?" +
                    "where auto_id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, auto.getAutoId());
            statement.setInt(2, auto.getYearOfIssue());
            statement.setString(3, auto.getNameModel());
            statement.setFloat(4, auto.getCost());
            statement.setString(5, auto.getColor());
            statement.setInt(6, auto.getMileage());
            statement.setString(7, auto.getTypeFuel());
            statement.setInt(8, auto.getEnginePower());
            statement.setFloat(9, auto.getEngineVolume());
            statement.setString(10, auto.getDriveUnit());
            statement.setString(11, auto.getTransmission());
            statement.setInt(12, auto.getUserId());
            statement.setInt(13, auto.getTypeAutoId());
            statement.setInt(14, auto.getBrandId());
            statement.setInt(15, auto.getAutoId());
            return statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static int delete(int auto_id){
        try (Connection connection = Connector.getConnectToMyDbAuto()) {
            String sql = "delete from auto where auto_id = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, auto_id);
                return statement.executeUpdate();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static int deleteByUserId(int user_id){
        try (Connection connection = Connector.getConnectToMyDbAuto()) {
            String sql = "delete from auto where user_id = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, user_id);
                return statement.executeUpdate();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    private static ArrayList<Auto> getAutosOfResultSet(ResultSet resultSet){
        ArrayList<Auto> autos = new ArrayList<>();
        try {

            while (resultSet.next()) {
                Auto auto = new Auto();
                auto.setAutoId(resultSet.getInt("auto_id"));
                auto.setYearOfIssue(resultSet.getInt("year_of_issue"));
                auto.setNameModel(resultSet.getString("name_model"));
                auto.setCost(resultSet.getFloat("cost"));
                auto.setColor(resultSet.getString("color"));
                auto.setMileage(resultSet.getInt("mileage"));
                auto.setTypeFuel(resultSet.getString("type_fuel"));
                auto.setEnginePower(resultSet.getInt("engine_power"));
                auto.setEngineVolume(resultSet.getFloat("engine_volume"));
                auto.setDriveUnit(resultSet.getString("drive_unit"));
                auto.setTransmission(resultSet.getString("transmission"));
                auto.setUserId(resultSet.getInt("user_id"));
                auto.setTypeAutoId(resultSet.getInt("type_auto_id"));
                auto.setBrandId(resultSet.getInt("brand_id"));
                autos.add(auto);
            }
        } catch (SQLException e) {
            System.err.println("Exeption in method getAutosOfResultSet");
            e.printStackTrace();
        }
        return autos;
    }

}
