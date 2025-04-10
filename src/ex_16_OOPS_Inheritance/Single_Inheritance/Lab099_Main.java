package ex_16_OOPS_Inheritance.Single_Inheritance;

public class Lab099_Main {
    public static void main(String[] args) {

        Vehicle v = new Vehicle();
        v.start();
//        v.drive();
        System.out.println(v.color);
//        System.out.println(v.brand);

        System.out.println("---------------------");

        Car myCar = new Car();

        myCar.start();  // Inherited from Vehicle
        myCar.drive();  // Own method of Car
        System.out.println(myCar.color); // Inherited field
        System.out.println(myCar.brand); // own field
        System.out.println("---------------------");

        Vehicle Car = new Car();

        Car.start();
//        Car.drive();
        System.out.println(Car.color);
//        System.out.println(Car.brand);
    }
}
class Vehicle {
    String color="Black";
    void start() {
        System.out.println("Vehicle is starting...");
    }
}
class Car extends Vehicle {
    String brand = "Range Rover";
    void drive() {
        System.out.println("Car is driving...");
    }
}