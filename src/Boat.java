import Adapter.Vehicle;

public class Boat implements Vehicle {
    public void accelerate() {
        System.out.println("Accelerating boat...");
    }

    public void brake() {
        System.out.println("Braking boat...");
    }

    public void soundHorn() {
        System.out.println("Hooooooooonk!");
    }
}
