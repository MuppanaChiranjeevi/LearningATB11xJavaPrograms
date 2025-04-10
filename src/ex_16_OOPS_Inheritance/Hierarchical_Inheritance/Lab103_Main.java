package ex_16_OOPS_Inheritance.Hierarchical_Inheritance;

public class Lab103_Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();      // Inherited from Vehicle
        myCar.accelerate(); // Own method

        Bike myBike = new Bike();
        myBike.start();    // Inherited from Vehicle
        myBike.balance();   // Own method

        Truck myTruck = new Truck();
        myTruck.start();   // Inherited from Vehicle
        myTruck.loadCargo();// Own method
    }
}
// Parent class
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

// Child class 1
class Car extends Vehicle {
    void accelerate() {
        System.out.println("Car is accelerating");
    }
}

// Child class 2
class Bike extends Vehicle {
    void balance() {
        System.out.println("Bike is balancing");
    }
}

// Child class 3
class Truck extends Vehicle {
    void loadCargo() {
        System.out.println("Truck is loading cargo");
    }
}

