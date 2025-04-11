package ex_23_Static_Keyword;

public class Lab143_Static_Keyword {
    public static void main(String[] args) {
        // Access static variable directly (no instance needed)

        System.out.println("Initial count: " + StaticDemo.count);

        // Access static final variable (constant)
        System.out.println("Value of PI: " + StaticDemo.PI);

        // Call static method
        StaticDemo.displayCount();
        System.out.println("----------------------------");
        // Create instances
        StaticDemo obj1 = new StaticDemo(10);
        obj1.displayInstanceVar();
        StaticDemo obj2 = new StaticDemo(20);
        obj2.displayInstanceVar();

        System.out.println("----------------------------");

        // Access static nested class
        StaticDemo.NestedStaticClass nestedObj = new StaticDemo.NestedStaticClass();
        nestedObj.display();

        // Static import demonstration (normally would be in another file)
        System.out.println("Max of 10 and 20: " + Math.max(10, 20));
    }
}
class StaticDemo {
    // Static variable (class variable)
    static int count ;

    // Static final variable (constant)
    static final double PI = 3.14159;

    // Instance variable
    int instanceVar;

    // Static block (executed when class is loaded)
    static {
        System.out.println("Static block executed \ncount: "+count);
        count = 100; // Initialize static variable
        System.out.println("count initialise to "+count);
        System.out.println("----------------------------");
    }

    // Constructor
    public StaticDemo(int instanceVar) {
        this.instanceVar = instanceVar;
        count++; // Increment static variable with each instance
    }


    // Static method
    public static void displayCount() {
        System.out.println("Current count: " + count);
      // Non-static members  cannot be referenced from a static context
      //  System.out.println("Instance variable: " + instanceVar) // This would cause error
    }

    // Instance method
    public void displayInstanceVar() {
        System.out.println("Instance variable: " + instanceVar);
        // Static members can be referenced from a non-static context
        System.out.println("Current count: " + count);
    }

    // Static nested class
    static class NestedStaticClass {
        void display() {
            System.out.println("Inside static nested class. Count is: " + count);
        }
    }


}