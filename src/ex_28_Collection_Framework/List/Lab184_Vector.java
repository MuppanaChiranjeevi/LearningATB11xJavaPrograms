package ex_28_Collection_Framework.List;

import java.util.*;

public class Lab184_Vector {
    /**
     * Vector is a legacy class in Java that implements the List interface.
     * It is part of the java.util package.
     * Vectors are growable arrays, which means they can dynamically resize.
     *
     * Key Features:
     * Allows duplicate elements.
     * Maintains insertion order.
     * Can store heterogeneous objects (if you don’t use generics).
     *
     * It is synchronized, so it’s thread-safe (but slower than ArrayList in single-threaded environments).
     * In Java, synchronized means that only one thread can access a method or block of code at a time.
     * The Vector class is synchronized, which means all of its methods are thread-safe.
     * If one thread is using a Vector method (like add() or remove()), other threads are blocked until the first one is done.
     */
    public static void main(String[] args) {
        // Creating a Vector without generics
        Vector mixedVector = new Vector();

        // Adding different types of objects
        mixedVector.add("Hello");         // String
        mixedVector.add(100);             // Integer (autoboxed)
        mixedVector.add(45.67);           // Double (autoboxed)
        mixedVector.add(true);            // Boolean (autoboxed)
        mixedVector.add(new Person("Alice", 30)); // Custom object

        // Printing all elements
        for (Object element : mixedVector) {
            System.out.println(element);
        }
    }
}

// A simple custom class
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Override toString to print Person nicely
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}