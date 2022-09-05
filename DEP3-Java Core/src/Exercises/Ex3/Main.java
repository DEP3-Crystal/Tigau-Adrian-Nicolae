package Exercises.Ex3;

public class Main {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.start();

        Car car = new Car();
        car.make = "Toyota";
        System.out.println(car.make);
        car.start();

        Motorcycle motorcycle = new Motorcycle();
        motorcycle.make = "Suzuki";
        System.out.println(motorcycle.make);
        motorcycle.start();

        Bmw bmw = new Bmw();
        bmw.start();
        bmw.turnOnAirConditioning();
        bmw.showTurnSignal();
    }
}
