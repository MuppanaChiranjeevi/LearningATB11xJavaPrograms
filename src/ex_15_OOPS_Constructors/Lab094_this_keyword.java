package ex_15_OOPS_Constructors;

/**
 * this keyword is a reference variable that refers to the current object
 * this keyword is used to distinguish between instance variables and local variables when their names are same.
 * this keyword is used to call instance methods and constructors of the current object.
 * this keyword is used within an instance method or constructor.
 *
 * Usage of Java this keyword
     * this can be used to refer current class instance variable.
     * this can be used to invoke current class method (implicitly)
     * this() can be used to invoke current class constructor.
     * this can be passed as an argument in the method call.
     * this can be passed as argument in the constructor call.
     * this can be used to return the current class object from the method.
 *
 */
class Bike {
    String name;
    String model;
    int year;

    // Default Constructor
    public Bike() {
        name= "Unknown";
        this.model = "UNKNOWN";
        System.out.println("Default Constructor");

    }

    // Parameterized Constructor with three parameter
    public Bike(String name,String model, int year) {
        this(model,year); //Calling the other constructor using 'this'
        this.name = name;
        // this.name refers to the instance variable name,
        // while the name on the right side refers to the constructor parameter.
        this.model=model;

    }
    // Parameterized Constructor with two parameter
    public Bike(String model,int year) {
        this(year);
        this.model = model;
    }

    // Parameterized Constructor with one parameter
    public Bike(int year) {
        this.year = year;
    }
    // Copy constructor
    Bike(Bike c) {
        // TODO Auto-generated constructor stub
        this.model=c.model;
        this.year=c.year;
        this.name=c.name;
    }

    void displayDetails() {
        System.out.println("Bike Name: "+name);
        System.out.println("Bike Model: " + model);
        System.out.println("Year: " + year);
        startEngine();
    }
    void startEngine() {
        System.out.println("Engine started.");
        this.drive(); // // Using 'this' to call the current object's method
    }

    void drive() {
        System.out.println("Car is moving.");
        this.method(this);
    }
    void method(Bike B){
        System.out.println("this is passed as an argument in the method call.");
        Cycle c=new Cycle(this);
    }

}

class Cycle{
    Cycle(Bike B){
        System.out.println("this is passed as argument in the constructor call.");
        System.out.println(B.name);
        this.getCycle();
    }
    Cycle getCycle(){
        System.out.println("this is used to return the current class instance from the method.");
        return this;
    }


}


public class Lab094_this_keyword {
    public static void main(String[] args) {
        // Creating objects using different constructors
        Bike Bike1 = new Bike();
        Bike Bike2 = new Bike("Unicorn","Honda", 2021);
        Bike Bike3 = new Bike("R15","Yamaha",2024);
        Bike Bike4 = new Bike(Bike2);

        Bike1.displayDetails();
        System.out.println("-----------------------------------");
        Bike2.displayDetails();
        System.out.println("-----------------------------------");
        Bike3.displayDetails();
        System.out.println("-----------------------------------");
        Bike4.displayDetails();
    }
}
