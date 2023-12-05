import Adapter.Vehicle;

public class Car implements Vehicle {
    String model;
    int numberOfDoors;

    public void accelerate() {
        System.out.println("Accelerating car...");
    }

    public void brake() {
        System.out.println("Braking car...");
    }

    public void soundHorn() {
        System.out.println("beeb beeb!");
    }
}
