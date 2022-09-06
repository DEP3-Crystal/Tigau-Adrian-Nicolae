package Exercises.Ex3;

public class Vehicle {
    protected String make;
    protected String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void start() {
        System.out.println("Starting vehicle");
    }

    public void showTurnSignal() {
        System.out.println("Showing turn signal");

    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
