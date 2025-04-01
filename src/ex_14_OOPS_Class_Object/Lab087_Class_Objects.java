package ex_14_OOPS_Class_Object;
//Define the Car class
class Car {
    // Instance variables( Fields/attributes/propeties)
    String brand;
    String model;
    int year;

    // Instance Method
    void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year );
    }

    // Method to start the car
    void startEngine() {
        System.out.println("Starting the engine of " + brand + " " + model);
    }
}
public class Lab087_Class_Objects {
    public static void main(String[] args) {
        // Creating objects of Car class
        Car car1;
        // car1 is declared as a reference variable of type Car,
        // it does not point to any actual Car object

//        car1.brand="BMW";     //error
//        car1.displayInfo();   // error

        car1 = new Car();
        //new Car(); --> creates a new object of the Car class in memory.

        // Car - Class Name (Reference type)
        // car1 - Object Reference (Reference variable)
        // new Car() ->new Object of the Car class

        Car car2 = new Car(); //  recommended way

        // Set attribute values for car1
        car1.brand = "Toyota";
        car1.model = "Camry";
        car1.year = 2020;

        // Set attribute values for car2
        car2.brand = "Honda";
        car2.model = "Civic";
        car2.year = 2022;


        // Call methods on objects
        car1.displayInfo();  // Output: Brand: Toyota, Model: Camry, Year: 2020
        car2.displayInfo();  // Output: Brand: Honda, Model: Civic, Year: 2022

        car1.startEngine();  // Output: Starting the engine of Toyota Camry
        car2.startEngine();  // Output: Starting the engine of Honda Civic

        //Anonymous abject
        new Car().brand="Tata";
        new Car().model="Nano";
        // Here, two separate anonymous objects are created,
        // but their values are not stored anywhere.
        new Car().displayInfo();
        // // But this would display default values (null, 0)
    }
}
