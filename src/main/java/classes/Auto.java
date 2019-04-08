package classes;

import java.io.Serializable;

public class Auto implements Serializable {
    private int autoId;
    private int yearOfIssue;
    private String nameModel;
    private double cost;
    private String color;
    private int mileage;
    private String typeFuel;
    private int enginePower;
    private double engineVolume;
    private String driveUnit;
    private String transmission;
    private int userId;
    private int brandId;
    private Brand brand = null;

    public int getAutoId() {
        return autoId;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public String getNameModel() {
        return nameModel;
    }

    public double getCost() {
        return cost;
    }

    public String getColor() {
        return color;
    }

    public int getMileage() {
        return mileage;
    }

    public String getTypeFuel() {
        return typeFuel;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getDriveUnit() {
        return driveUnit;
    }

    public String getTransmission() {
        return transmission;
    }

    public int getUserId() {
        return userId;
    }


    public int getBrandId() {
        return brandId;
    }

    public Brand getBrand() {
        return brand;
    }
    public Auto(){

    };

    public Auto(int yearOfIssue, String nameModel, double cost, String color, int mileage, String typeFuel,
                int enginePower, double engineVolume, String driveUnit, String transmission, int userId, int brandId) {
        this.yearOfIssue = yearOfIssue;
        this.nameModel = nameModel;
        this.cost = cost;
        this.color = color;
        this.mileage = mileage;
        this.typeFuel = typeFuel;
        this.enginePower = enginePower;
        this.engineVolume = engineVolume;
        this.driveUnit = driveUnit;
        this.transmission = transmission;
        this.userId = userId;
        this.brandId = brandId;
    }

    public void setAutoId(int autoId) {
        this.autoId = autoId;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public void setNameModel(String nameModel) {
        this.nameModel = nameModel;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void setTypeFuel(String typeFuel) {
        this.typeFuel = typeFuel;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setDriveUnit(String driveUnit) {
        this.driveUnit = driveUnit;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }


    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

}
