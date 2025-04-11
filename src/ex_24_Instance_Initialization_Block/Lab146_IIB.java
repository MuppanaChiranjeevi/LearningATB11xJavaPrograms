package ex_24_Instance_Initialization_Block;

public class Lab146_IIB {
    public static void main(String[] args) {
        new Child();
    }
}
class Parent {
    {
        System.out.println("Parent IIB");
    }
  static {
      System.out.println("Parent Static");
  }

    Parent() {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent {
    {
        System.out.println("Child IIB");
    }
    static {
        System.out.println("Child Static");
    }
    Child() {
        System.out.println("Child Constructor");
    }

}

/**
 * Step-by-Step Explanation:
 * Class Loading Phase (Static Initialization)
     * When new Child() is called, JVM first loads all required classes
     * Parent class is loaded first (because Child extends Parent)
     * Parent Static block executes
     * Then Child class is loaded
     * Child Static block executes
 * Object Creation Phase
     * Memory is allocated for the Child object
     * Parent's IIB runs before Parent's constructor
     * Child's IIB runs before Child's constructor
 */