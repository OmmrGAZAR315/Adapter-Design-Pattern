import Adapter.*;

public class Main {
    public static void main(String[] args) {
        //Create my normal objects
        Vehicle car = new Car();
        Vehicle boat = new Boat();
        Vehicle roller_coaster = new Roller_Coasters();

        //Create not compatible objects
        Submarine s1 = new Submarine();
        Bike b1 = new Bike();

        //create adapter for submarine
        Vehicle submarine = new Submarine_adapter(s1);
        //create adapter for bike
        Vehicle bike = new Bike_adapter(b1);

        testVehicle(car);
        testVehicle(boat);
        testVehicle(roller_coaster);
        testVehicle(submarine);
        testVehicle(bike);

    }

    public static void testVehicle(Vehicle vehicle) {
        vehicle.accelerate();
        vehicle.brake();
        vehicle.soundHorn();
        System.out.println();
    }
}