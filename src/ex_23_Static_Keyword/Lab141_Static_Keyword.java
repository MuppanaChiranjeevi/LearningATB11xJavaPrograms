package ex_23_Static_Keyword;

public class Lab141_Static_Keyword {
    /**
     * static keyword in Java is used for memory management
     * static keyword is used to indicate that a particular member(variable, method, or block)
     * belongs to the class itself, rather than to instances of the class.
     * static members are shared among all instances of the class.
     * The static members belongs to the class rather than to instance of the class
     * They can be accessed without creating an object of the class.
     * this and super cannot be used in static context
     * you can access static members (variables and methods) inside a constructor in Java.
     *
     * static keyword can be applied to:
     * Variables (fields)
     * Methods
     * Blocks
     * Nested classes
     *
     * static variable
     * If you declare any variable as static, it is known as a static variable.
     * The static variable can be used to refer to the common property of all objects (which is not unique for each object)
     * Static variables are initialized when the class is loaded into memory by the JVM (Java Virtual Machine),
     * which happens:
     * Before any instances of the class are created.
     * Only once during the program's execution
     *
     * static method
     * If you apply static keyword with any method, it is known as static method.
     * A static method can be invoked without creating an instance of a class.
     * A static method can access static data member and can change the value of it
     *
     * static block
     * static block used to initialize the static data member.
     * static block gets executed only once before the main method at the time of class loading.
     * If there are multiple static blocks, they will be executed in the order of their occurrence.
     *
     *
     * Non-static members (variables and methods) cannot be referenced from a static context (like a static method or static block).
     * Static members (variables or methods) can be referenced from a non-static context (like an instance method),
     * because static members belong to the class itself and are shared across all instances.
     */
    public static void main(String[] args) {
        Counter c1 = new Counter(); // Count: 1
        Counter c2 = new Counter(); // Count: 2
        Counter c3 = new Counter(); // Count: 3
        System.out.println("---------------------");
        System.out.println("Square: "+Counter.square(2));
        System.out.println("Square: "+c1.square(3));
        System.out.println("Square: "+c3.square(4));
        System.out.println("---------------------");
        System.out.println("Square: "+Counter.cmnprpty);
        System.out.println("Square: "+c3.cmnprpty);
        System.out.println("Square: "+c2.cmnprpty);


    }
}
class Counter {
    int i;   //instance variable
    static int count ; //static variable (shared across all instances)
    static String cmnprpty="JAVA"; // static variable (shared across all instances)
    Counter() {
        i++;
        System.out.println("i: " + i);
        // accessing static variable
        count++;
        System.out.println("Count: " + count);

        //invoking static method
        System.out.println("Square of 10: "+square(10));
    }
    static int square(int x) {
        return x * x;
    }
    // Static block - runs when class loads
    static {
        System.out.println("Static block executed.");
    }
}

