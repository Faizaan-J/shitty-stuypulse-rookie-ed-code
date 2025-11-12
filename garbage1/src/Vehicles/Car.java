package Vehicles;

public class Car extends Vehicle {
    public Car(double weight, String manufacturer, int numOfSeats, boolean isTransformer, Team team) {
        super(weight, manufacturer, numOfSeats, isTransformer, team);
    }

    @Override
    public void startEngine() {
        System.out.println("Starting car. Manufacturer: " + manufacturer + " | Weight: " + weight + " | " + "IsTransformer: " + isTransformer + " | Team: " + team);
        if (!super.isTransformer) {
            System.out.println("Started car");
            return;
        };

        if (super.team == Team.AUTOBOT) {
            super.ejectPassengers();
        } else if (super.team == Team.DECEPTICON) {
            super.killPassengers();
        }
        System.out.println("Started car");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping car. Manufacturer: " + manufacturer + " | Weight: " + weight + " | " + "IsTransformer: " + isTransformer + " | Team: " + team);
        if (super.team == Team.DECEPTICON) {
            killPassengers();
        }
        System.out.println("Stopped car");
    }
}
