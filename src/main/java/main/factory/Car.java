package main.factory;

public class Car {

    private final String vehicleType = "car";
    private String model;
    int buildYear;
    private int maxSpeed;
    String color;
    int maxFuel;
    int currentFuel;
    int consumption;

    public Car() {
        this.model = "";
        this.buildYear = 0;
        this.maxSpeed = 0;
        this.color = "";
        this.maxFuel = 0;
        this.currentFuel = 0;
        this.consumption = 0;

    }

    public String getVehicleType() {
        return this.vehicleType;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getbuildYear() {
        return this.buildYear;
    }

    public void setbuildYear(int buildYear) {
        this.buildYear = buildYear;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBuildYear() {
        return buildYear;
    }

    public void setBuildYear(int buildYear) {
        this.buildYear = buildYear;
    }

    public int getMaxFuel() {
        return maxFuel;
    }

    public void setMaxFuel(int maxFuel) {
        this.maxFuel = maxFuel;
    }

    public int getCurrentFuel() {
        return currentFuel;
    }

    public void setCurrentFuel(int currentFuel) {
        this.currentFuel = currentFuel;
    }

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    public void showData() {
        System.out.println("Model: " + this.getModel());
        System.out.println("Godina proizvodnje :" + this.getBuildYear());
        System.out.println("Boja :" + this.color);
        System.out.println("Potrosnja :" + this.consumption);
        System.out.println("Stanje rezervoara :" + this.consumption);
        System.out.println("Kapacitet rezervoara je :" + this.getMaxFuel());
        System.out.println("Maksimalna brzina :" + this.maxSpeed);

    }
    public void travel () {
        
    }
}
