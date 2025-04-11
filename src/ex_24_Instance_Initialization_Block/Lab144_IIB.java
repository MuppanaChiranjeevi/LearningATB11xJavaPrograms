package ex_24_Instance_Initialization_Block;

public class Lab144_IIB {
    /**
     * In Java, an Instance Initialization Block (IIB) is a block of code within a class that is executed
     * every time an object of that class is created, before the constructor is executed.
     * The instance initialization block gets executed every time an object is created.
     * Executed after static blocks (if any) but before the constructor
     * It runs before the constructor, but after initialization of the instance variables.
     * Multiple IIBs are allowed - they executed in the order they appear.
     * It is used to initialize instance variables or perform setup operations that are common to all constructors in the class.
     *
     */
    public static void main(String[] args) {
        new IIBDemo();
        System.out.println("---------------------");
        new IIBDemo();
    }
}
class IIBDemo {
    // Instance variables
    int x;
    int y;
    static {
        System.out.println("Static block executing");
    }

    // First Instance Initialization Block
    {
        System.out.println("First IIB executing");
        System.out.println("X: "+x);
        x = 10;

    }

    // Second Instance Initialization Block
    {
        System.out.println("Second IIB executing");
        System.out.println("Y: "+y);
        y = 20;
    }

    // Constructor
    public IIBDemo() {
        System.out.println("Constructor executing");
        System.out.println("x = " + x + ", y = " + y);
    }


}