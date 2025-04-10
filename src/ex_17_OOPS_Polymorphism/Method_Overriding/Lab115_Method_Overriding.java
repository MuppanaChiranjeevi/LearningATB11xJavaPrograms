package ex_17_OOPS_Polymorphism.Method_Overriding;

public class Lab115_Method_Overriding {
    public static void main(String args[]){
        Vehicle v=new Vehicle();
        v.run();
        Bike obj = new Bike();//creating object
        obj.run();//calling method

        Car c =new Car();
        c.run();
    }
}
//Creating a parent class.
class Vehicle{
    //defining a method
     void run(){System.out.println("Vehicle is running");}
}
//Creating a child class
class Bike extends Vehicle{
    //defining the same method as in the parent class
    // overriding method cannot have a more restrictive access modifier
    @Override
    protected void run(){System.out.println("Bike is running Fastly");}
}
class Car extends Bike{
    //defining the same method as in the parent class
    // overriding method cannot have a more restrictive access modifier
    @Override
    public void run(){System.out.println("Car is running Safely");}
}