package ex_22_OOPS_Interfaces;

public class Lab138_Interfaces {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        myCar.stop();            // calls overridden method
        myCar.fuelType();        // calls default method

        Vehicle.generalInfo();   // calls static method using interface
        System.out.println("Max Speed: " + Vehicle.MAX_SPEED);
    }
}
interface Vehicle {

    // Constant (public static final)
    int MAX_SPEED = 120;

    // Abstract method (public and abstract by default)
    void start();
    public abstract void stop();

    // Default method (Java 8+)
    default void fuelType() {
        System.out.println("Default Fuel: Petrol");
        log("calling private method");  // calling private method
    }

    // Static method (Java 8+)
    // all static methods in interfaces are implicitly public
     static void generalInfo() {
        System.out.println("static method invoked");
        logStatic();  // calling private static method
    }

    // Private method (Java 9+)
    private void log(String message) {
        System.out.println("LOG: private method called");
    }

    // Private static method (Java 9+)
    private static void logStatic() {
        System.out.println("LOG: private static method called");
    }
}
class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping...");
    }
}