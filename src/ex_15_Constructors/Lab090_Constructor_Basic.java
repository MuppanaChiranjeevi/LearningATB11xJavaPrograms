package ex_15_Constructors;
/**
 * In Java, A constructor is a special type of method that is used to initialize the object.
 * Constructors are used to initialize the instance variables during object creation.
 * When an object of a class is created, constructor is called/invoked automatically to initialize the object.
 * Constructors have the same name as the class and do not have a return type, not even void.
 * If you do not define any constructor in your class, Java compiler provides a default constructor by default
 that initializes the member variables/instance variables to their default values.

 * There are two types of constructors in Java:
     Default Constructor (no-argument constructor/ non-parameterized constructor)
     --> A constructor which has no arguments/parameters.
     Parameterized Constructor (constructor with arguments)
     --> A Constructor which has parameters

 Key Characteristics of Constructors:
     Same name as the class
     No return type (not even void)
     Automatically called when object is created
     Can be overloaded – Multiple constructors can be defined in a class with different parameters list (Constructor Overloading).
     If not defined, Java provides a default constructor

 Constructor Overloading allows a class to have multiple constructors with different parameters list.
 This enables different ways to create an object of the same class.

 */
public class Lab090_Constructor_Basic {
    public static void main(String[] args) {
        Company1 company1;
        company1=new Company1();
        new Company1();
        System.out.println("--------------------");
        System.out.println("Name: "+company1.empName);
        System.out.println("Id: "+company1.empId);
        System.out.println("Salary: "+company1.salary);
        System.out.println("--------------------");
        company1.displayDetails();
    }
}
class Company1{
    String empName;
    int empId;
    double salary;

 //Default Constructor
	Company1(){
		System.out.println("Default Constuctor");
	}
    void displayDetails(){
        System.out.println("Name: "+empName);
        System.out.println("Id: "+empId);
        System.out.println("Salary: "+salary);
    }

}