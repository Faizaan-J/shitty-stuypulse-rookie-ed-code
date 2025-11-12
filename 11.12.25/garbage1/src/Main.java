import Vehicles.Car;
import Vehicles.Team;
import Vehicles.Truck;
import Vehicles.Vehicle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[5];
        vehicles[0] = new Car(4200, "Nissan", 5, false, Team.NONE);
        vehicles[1] = new Car(6000, "Toyota", 5, true, Team.DECEPTICON);
        vehicles[2] = new Car(7000, "Honda", 5, true, Team.DECEPTICON);
        vehicles[3] = new Truck(42000, "Peterbilt", 2, true, Team.AUTOBOT);
        vehicles[4] = new Truck(60000, "Camaro", 4, true, Team.AUTOBOT);

        for (Vehicle vehicle : vehicles) {
            vehicle.startEngine();
            vehicle.stopEngine();
        }
    }
}