package Adapter;

public class Submarine_adapter implements Vehicle{
    private final Submarine submarine;

    public Submarine_adapter(Submarine submarine) {
        this.submarine = submarine;
    }

    public void accelerate() {
        submarine.dive();
    }

    public void brake() {
        submarine.surface();
    }

    public void soundHorn() {
        submarine.soundSonar();
    }
}
