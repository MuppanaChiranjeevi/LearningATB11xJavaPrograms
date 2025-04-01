package ex_15_Constructors;

/**
 * There are three ways to initialize object in Java.
 *      By reference variable
 *      By method
 *      By constructor
 */
class Employee{
    int id;
    String name;
    Employee(){
        System.out.println("Default constructor");
    }

    Employee(int i, String n){
        id=i;
        name=n;
    }
    void insertRecord(int r, String n){
        id=r;
        name=n;
    }
    void displayInformation(){
        System.out.println(id+" "+name);
    }
}

public class Lab093_Object_Intitalise_Ways{
    public static void main(String args[]){
        //Creating objects
        Employee s1=new Employee();
        Employee s2=new Employee(102,"Amit");  //Object Initialization through constructor
        Employee s3=new Employee();

        //Object Initialization through Reference Variable
        s1.id=101;
        s1.name="Sonoo";

        //Object Initialization through Method
        s3.insertRecord(103, "Balu");

        //Printing data
        System.out.println(s1.id+" "+s1.name);
        s2.displayInformation();
        s3.displayInformation();

    }
}