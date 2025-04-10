package ex_20_OOPS_Super_Keyword;

public class Lab131_This_Super {
    /**
     * this Keyword
     * Refers to the current object of the class.
     * Use this when you need to:
     * Differentiate between instance variables and parameters with same names
     * Call another constructor in the same class
     * Pass the current object as a parameter
     *
     * super Keyword
     * Refers to the parent (superclass) object.
     * Use super when you need to:
     * Access parent class members that are hidden by child class
     * Call parent class constructor from child class
     * Invoke overridden parent class methods
     */
    public static void main(String[] args) {
        Car car =new Car();
        car.printColors();
        System.out.println("-----------------");
        car.callDisplays();
        System.out.println("-----------------");
        Car car1 =new Car("Hello");
    }
}
class Vehicle {
    String color = "Red";
    void display() {
        System.out.println("Parent display");
    }
    Vehicle() {
        System.out.println("Vehicle no-arg constructor");
    }

    Vehicle(String msg) {
        System.out.println("Vehicle constructor: " + msg);
    }
}

class Car extends Vehicle {
    String color = "Blue";

    void printColors() {
        System.out.println("Local color: " + color);         // Blue
        System.out.println("Current class color: " + this.color);  // Blue
        System.out.println("Parent class color: " + super.color);  // Red
    }
    void display() {
        System.out.println("Child display");
    }
    void callDisplays() {
        display();      // Child display
        this.display();  // Child display
        super.display(); // Parent display
    }
    Car() {
        // super() is called implicitly here
        System.out.println("Child no-arg constructor");
    }

    Car(String msg) {
        super(msg);  // Explicit parent constructor call
        System.out.println("Child constructor: " + msg);
    }
}

