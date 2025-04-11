package ex_24_Instance_Initialization_Block;

public class Lab145_IIB {
    public static void main(String[] args) {
        // Create objects using different constructors
        Car car1 = new Car("Tesla", 2023);
        car1.display();

        Car car2 = new Car("Ford");
        car2.display();

        Car car3 = new Car();
        car3.display();
    }
}
class Car {
    private String model;
    private int year;

    // Instance Initialization Block (IIB)
    {
        System.out.println("Instance Initialization Block is executed.");
        model = "Base Model";  // Default value
        year = 2020;        // Default value
    }

    // Constructor 1
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
        System.out.println("Car constructor with two argument executed.");
    }

    // Constructor 2
    public Car(String model) {
        this.model = model;
        System.out.println("Car constructor with one argument executed.");
    }
    // Constructor 2
    public Car() {
        System.out.println("Car constructor with no argument executed.");
    }

    public void display() {
        System.out.println("Car model: " + model + ", Year: " + year);
    }
}


