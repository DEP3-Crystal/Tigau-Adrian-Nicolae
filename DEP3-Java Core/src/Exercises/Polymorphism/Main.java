package Exercises.Polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        Car car = new Car("Toyota", "Corolla");
        Car toyota = new Car("Toyota", "Corolla");
        Car audi = new Car("Audi", "A5");
        Motorcycle motorcycle = new Motorcycle("Suzuki", "Katana");

//        Vehicle vehicle = (Vehicle) toyota; //UP-CASTING


        List<Vehicle> fleet = new ArrayList<>();
        fleet.add(toyota);
        fleet.add(audi);
        fleet.add(motorcycle);
//        fleet.add(new Bmw("X5"));

        countCars(fleet);
        turnOnAirConditioning(fleet);

        turnOnAirConditioningInVehicle(toyota);
        turnOnAirConditioningInVehicle(motorcycle);

        startAndShowTurnSignal(toyota);
        startAndShowTurnSignal(audi);
        startAndShowTurnSignal(motorcycle);

        byte b = 5;
        add(b);

//        short s = 5;
//        int i = s;                 //Implicit casting
//
//        short s2 = (short) i;      //Explicit casting
    }

    static void add(int i) {
    }

    static void add(short i) {
    }


    public static void countCars(List<Vehicle> fleet) {
        int count = 0;
        for (Vehicle vehicle : fleet) {
            if (vehicle instanceof Vehicle) {
                count++;
            }


//            if (vehicle.getClass() == Car.class) {                     //Not the preferred way!
//                count++;
//            }
        }

        System.out.println(count);
    }

    public static void turnOnAirConditioning(List<Vehicle> fleet) {
        for (Vehicle vehicle : fleet) {
            if (vehicle instanceof Car) {                               //Always include an instanceof check when we do DOWN-CASTING

                Car car = (Car) vehicle;
                car.turnOnAirConditioning();

//                ((Car) vehicle).turnOnAirConditioning();

            }
        }
    }

    public static void turnOnAirConditioningInVehicle(Vehicle vehicle) {

    }

//    public static void startAndShowTurnSignal(Car car){
//        car.start();
//        car.showTurnSignal();
//    }
//
//    public static void startAndShowTurnSignal(Motorcycle moto){
//        moto.start();
//        moto.showTurnSignal();
//    }


    public static void startAndShowTurnSignal(Vehicle vehicle) {
        System.out.println("Starting and turning for parent class");
        vehicle.start();
        vehicle.showTurnSignal();
    }

    public static void startAndShowTurnSignal(Car vehicle) {
        System.out.println("Starting and turning for car class");
        vehicle.start();
        vehicle.showTurnSignal();
    }

}

//GIVE ME AN EXAMPLE OF COMPILE TIME/RUNTIME POLYMORPHISM
//READ ABOUT COVARIANT RETURN TYPES
//READ ABOUT ABSTRACTION
