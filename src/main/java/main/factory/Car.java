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
    
    private int seats;
    
    private int passengers = 1;

    private double mileage;

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public Car() {
        this.model = "";
        this.buildYear = 0;
        this.maxSpeed = 0;
        this.color = "";
        this.maxFuel = 0;
        this.currentFuel = 0;
        this.consumption = 0;
        this.mileage = 0;
        this.passengers = 1;

    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
    
    

    public Car(double mileage, String model) {
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
        System.out.println("Stanje rezervoara :" + this.getConsumption());
        System.out.println("Kapacitet rezervoara je :" + this.getMaxFuel());
        System.out.println("Maksimalna brzina :" + this.getMaxSpeed());
        System.out.println("Kilometraza :" + this.getMileage());

    }

    public void travel(int distance) {
        if (this.getCurrentFuel() > distance * this.getConsumption())  {
            this.mileage = this.getMileage() + distance;
            this.currentFuel = this.getCurrentFuel() - (distance * this.getConsumption());
        } else {
            System.out.println("Uspesno ste putnovali: " + distance + "kilometara.");

        }
    }
       
    

    public void fuelUp (int refill) {
        
        int emptySpace = this.getMaxFuel() - this.getCurrentFuel();
        
        if (refill <= emptySpace) {

        this.currentFuel = this.getCurrentFuel() + refill;
            System.out.println("Uspesno ste sipali: " + refill + "Novo stanje je: " + this.getCurrentFuel());
        
    } else {
            this.currentFuel = this.getMaxFuel();
            System.out.println("Rezervoar je pun. Sipali ste: " + (refill - emptySpace) );
  
    }
    }
    
    public void getIn() {
    // 1 osoba je usla u vozilo
    
    
    
    } 
    
    public void getIn(int numberOfPeople) {
    // numberOfPeople osoba je uslo u vozilo
    }
    
    public void getOut () {
        //1 osoba je izasla iz vozila
    }
    
    public void getOut (int numberOfPeople) {
        //numberOfPeople osoba je izasla iz vozila
    }
}
