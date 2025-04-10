package ex_20_OOPS_Super_Keyword;

public class Lab129_Super_Keyword {
    /**
     * The super keyword in Java is a reference variable used to access members (variables, methods, and constructors) of the immediate parent class (superclass).
     * The super keyword in Java is a reference variable that is used to refer to the immediate parent class object.
     * Uses of Java super Keyword
     * super can be used to refer to the immediate parent class instance variable.
     * super can be used to invoke the immediate parent class method.
     * super() can be used to invoke the immediate parent class constructor.
     * Notes:
     * You cannot use super in a static context.
     * super() must be the first statement in the child constructor
     * If omitted, the compiler automatically adds super() (calling the no-arg parent constructor)
     * super() is added in each class constructor automatically by the compiler if there is no super() or this().
     * If the parent doesn't have a no-arg constructor, you must explicitly call super(...) with appropriate arguments
     * Only one explicit constructor call allowed in constructor
     *
     */
    public static void main(String[] args) {
        Child c =new Child();
        c.printNumbers();
        c.greet();
        System.out.println(c.num);
        System.out.println("------------------");
        Child child=new Child(500);
    }

}

class Parent {
    int num = 100;
    Parent() {
        System.out.println("Parent constructor");
    }
    Parent(String name) {
        System.out.println("Parent parametrised constructor: " + name);
    }
    void greet() {
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent {
    int num = 200;
    Child() {

//        super(); // If no super() is written, Java automatically inserts a no-argument call to the superclass constructor.

//        super("Chiru"); // Only one explicit constructor call allowed in constructor

        System.out.println("Child constructor");
    }
    Child(int num) {
        this.num=num;
        System.out.println("Child parametrised constructor");
    }
    void printNumbers() {
        System.out.println(num);        // prints 200
        System.out.println(super.num);  // prints 100
    }
    void greet() {
        super.greet();  // calls the parent method
        System.out.println("Hello from Child");
    }
}
