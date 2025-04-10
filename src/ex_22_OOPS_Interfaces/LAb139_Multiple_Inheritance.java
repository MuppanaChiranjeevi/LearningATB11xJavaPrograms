package ex_22_OOPS_Interfaces;

public class LAb139_Multiple_Inheritance {
    public static void main(String args[]){
        Computer c = new Computer();
        c.print();
        c.show();
        c.greet();
        System.out.println("------------------------");
       Chiranjeevi laptop=new Laptop();
       laptop.print();
       laptop.show();
       laptop.greet();
       laptop.learn();
        System.out.println("Name: "+Chiranjeevi.name());
        }
    }
//Creating two interfaces
interface Printables{
    void print();
    void greet();
}
interface Showable{
    void show();
    void greet();
}
interface Chiranjeevi extends Printables,Showable{
    // default method
    default void learn(){
        System.out.println("Chiranjeevi is learning");
    }
    // static method
    public static String name(){
        return "Muppana Chiranjeevi";
    }

}

//Creating a class that implements two interfaces
class Computer implements Printables,Showable{
    public void print(){System.out.println("printing data...");}

    public void show(){System.out.println("showing data...");}

    @Override
    public void greet() {
        System.out.println("Hello, Good Morning");
    }

}

class Laptop implements Chiranjeevi{

    @Override
    public void print() {
        System.out.println("Laptop Print");
    }

    @Override
    public void show() {
        System.out.println("Laptop Show");
    }

    @Override
    public void greet() {
        System.out.println("Hello, Good Night");
    }

}
