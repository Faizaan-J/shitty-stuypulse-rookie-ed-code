package Vehicles;

public class Truck extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Starting truck. Manufacturer: " + manufacturer + " | Weight: " + weight + " | " + "IsTransformer: " + isTransformer + " | Team: " + team);
        if (!super.isTransformer) {
            System.out.println("Truck started");
            return;
        }

        if (super.team == Team.DECEPTICON) {
            super.killPassengers();
        } else if (super.team == Team.AUTOBOT) {
            super.ejectPassengers();
        }
        System.out.println("Truck started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping truck. Manufacturer: " + manufacturer + " | Weight: " + weight + " | " + "IsTransformer: " + isTransformer + " | Team: " + team);
        if (!super.isTransformer) {
            System.out.println("Truck stopped");
            return;
        }

        if (super.team == Team.DECEPTICON) {
            super.killPassengers();
        }

        System.out.println("Truck stopped");
    }

    public Truck(double weight, String manufacturer, int numOfSeats, boolean isTransformer, Team team) {
        super(weight, manufacturer, numOfSeats, isTransformer, team);
    }
}
