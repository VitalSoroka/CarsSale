package classes;

import java.io.Serializable;

public class Auto implements Serializable {
    private int autoId;
    private int yearOfIssue;
    private String nameModel;
    private float cost;
    private String color;
    private int mileage;
    private String typeFuel;
    private int enginePower;
    private float engineVolume;
    private String driveUnit;
    private String transmission;
    private int userId;
    private int typeAutoId;
    private int brandId;
    private Brand brand = null;
    private TypeAuto typeAuto = null;

    public int getAutoId() {
        return autoId;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public String getNameModel() {
        return nameModel;
    }

    public float getCost() {
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

    public float getEngineVolume() {
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

    public int getTypeAutoId() {
        return typeAutoId;
    }

    public int getBrandId() {
        return brandId;
    }

    public Brand getBrand() {
        return brand;
    }

    public TypeAuto getTypeAuto() {
        return typeAuto;
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

    public void setCost(float cost) {
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

    public void setEngineVolume(float engineVolume) {
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

    public void setTypeAutoId(int typeAutoId) {
        this.typeAutoId = typeAutoId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public void setTypeAuto(TypeAuto typeAuto) {
        this.typeAuto = typeAuto;
    }
}
