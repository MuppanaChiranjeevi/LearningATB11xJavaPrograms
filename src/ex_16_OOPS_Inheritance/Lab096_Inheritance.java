package ex_16_OOPS_Inheritance;

public class Lab096_Inheritance {
    /**
     *
     * Inheritance is one of the fundamental principles of object-oriented programming (OOP)
     * Inheritance allows a class to inherit properties and behaviors from another class.
     * Inheritance represents the IS-A relationship which is also known as a parent-child relationship.
     *
     * Subclass (Child Class)
     * A subclass is a class that inherits from another class (superclass).
     * It is also known as: Derived class, Extended class, Child class
     * A subclass not only inherits attributes and methods from its superclass,
     * but it can also define its own specific attributes and methods.
     * The subclass inherits all non-private fields and methods of the superclass
     * ✅ A subclass can override or extend the behavior of a superclass.
     *
     * Superclass (Parent Class)
     * A superclass is a class that is inherited by another class (subclass).
     * It is also called: Base class, Parent class
     * ✅ A superclass provides reusable methods and fields that can be used by subclasses.
     *
     * Simply:
     * The class that inherits another class is called the Subclass (Child Class).
     * The class that is inherited by another class is called the Superclass (Parent Class).
     *
     * extends keyword: Used to establish inheritance between classes
     *
     * Advantages of Inheritance
     * ✅ Code reuse – Reduces redundancy
     * ✅ Improves maintainability
     * ✅ Supports polymorphism – The same method can have different implementations
     * ✅ Establishes a relationship between classes
     *
     * Basic Syntax:
     * class Superclass {
     *     // fields and methods
     * }
     *
     * class Subclass extends Superclass {
     *     // additional fields and methods
     * }
     *
     * Types of Inheritance in Java
     *  Single Inheritance: A subclass inherits from one superclass
     *  Multilevel Inheritance – A subclass inherits from another subclass, forming a chain of inheritance
     *  Hierarchical Inheritance: Multiple subclasses inherit from one superclass
     *  Multiple Inheritance (through Interfaces): A subclasses inherits from  more than one superclass, it is known as multiple inheritance.
     *  Note: Java does not support multiple inheritance with classes to avoid ambiguity  and complexity caused by the Diamond Problem,
     *  but allows it through interfaces.
     */
    public static void main(String[] args) {
        Father f = new Father();
        System.out.println(f.surName);
        System.out.println(f.money);
        f.eat();
        System.out.println("-----------------------");
        Son s = new Son();
        System.out.println(s.name+" "+s.surName);
        System.out.println(s.money);
        s.sleep();
        s.eat();

    }
}
class Father{
    String surName = "Muppana";
    int money= 10000;

    void eat(){
        System.out.println("Eating");
    }
}

class Son extends Father{
    String name="Chiranjeevi";
    void sleep(){
        System.out.println("Sleeping");
    }
}


