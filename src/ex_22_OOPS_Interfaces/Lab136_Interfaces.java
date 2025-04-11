package ex_22_OOPS_Interfaces;

public class Lab136_Interfaces {
    /**
     * In Java, an interface is a blueprint for a class.
     *
     * It is a reference type, similar to a class, but it only contains:
     *  - Method signatures (abstract methods — by default public and abstract)
     *  - Constants (by default, public static final)
     *
     *  Interfaces are used to achieve:
     *   - Total abstraction
     *   - Multiple inheritance
     *   - Loose coupling
     *
     * Interface cannot be instantiated just like the abstract class.
     * An interface is declared by using the interface keyword
     * The class which implements the interface must implement all the abstract methods.Otherwise, it should be made abstract.
     * A class can extend only one Java class and implement multiple Java interfaces.
     * An interface can extend multiple interfaces.
     * If a class implements multiple interfaces, or an interface extends multiple interfaces, it is known as multiple inheritance.
     * Interface cannot have constructors
     *
     * Java Interface Enhancements:
     * Since Java 8, we can have default and static methods in an interface.
     * Since Java 9, we can have private methods in an interface.
     *
     * In Java interfaces, static methods are implicitly public
     *  — even if you don’t explicitly declare them with the public keyword.
     * Syntax:
     * interface InterfaceName {
     *     // constant declarations
     *     // method signatures
     *     // default methods
     *     // static methods
     * }
     */
    public static void main(String args[]){
        Printable p=new Printer();
        p.print();
        System.out.println("Constant: "+Printable.NUMBER);
    }
}
//Creating an interface
interface Printable{
    // Constant (public static final)
    int NUMBER = 100;

    // Abstract method (public and abstract by default)
    void print();
}
//Creating a class that implements Printable
class Printer implements Printable{
    public void print(){
//        NUMBER = 200; // Cannot change the value of a final variable 'NUMBER'
        System.out.println("Print Method Implemented");
    }
}