package Vehicles;

public abstract class Vehicle {
    double weight;
    String manufacturer;
    int numOfSeats;
    boolean isTransformer;
    Team team;

    public Vehicle(double weight, String manufacturer, int numOfSeats, boolean isTransformer, Team team) {
        this.weight = weight;
        this.manufacturer = manufacturer;
        this.numOfSeats = numOfSeats;
        this.isTransformer = isTransformer;
        this.team = team;
    }

    public void killPassengers() {
        System.out.println("Crushed all passengers");
    }

    public void ejectPassengers() {
        System.out.println("Ejected passengers");
    }

    public abstract void startEngine();
    public abstract void stopEngine();
}
