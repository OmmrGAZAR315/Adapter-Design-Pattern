package Adapter;

public class Bike_adapter implements Vehicle{
    private final Bike bike;
    public Bike_adapter(Bike bike) {
        this.bike = bike;
    }

    public void accelerate() {
        bike.pedal();
    }

    public void brake() {
        bike.brake();
    }

    public void soundHorn() {
        bike.ringBell();
    }
}
