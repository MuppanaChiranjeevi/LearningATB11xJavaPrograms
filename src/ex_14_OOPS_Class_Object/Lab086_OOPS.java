package ex_14_OOPS_Class_Object;

public class Lab086_OOPS {
    /**
     * Object-Oriented Programming (OOP) in java is a programming methodology or paradigm used to design and develop
     * applications and programs by organizing the code into classes and objects.
     * The Four Main OOP Principles in Java:
     * 	    Encapsulation – Hides data and provides controlled access using getters/setters.
     * 	    Inheritance – Enables code reuse by allowing one class to inherit another.
     * 		Polymorphism – Allows the same method to have different behaviors (overloading & overriding).
     * 		Abstraction – Hides complex implementation details and exposes only the necessary features.
     *
     * Key OOP Concepts in Java:
     * 		Class: Blueprint for creating objects
     * 		Object: Instance of a class
     * 		Constructor: Special method to initialize objects
     * 		this keyword: Refers to the current object
     * 		super keyword: Refers to parent class objects
     * 		static keyword: For class-level variables/methods
     * 		final keyword: Makes variables constant or prevents method overriding
     *
     * Class
     * 		In Java, a class is a user-defined data that serves as a blueprint or template for creating objects.
     * 		A Class defines the state and behavior that the objects of that class will have.
     *      In OOP, the terms "properties," "fields," "attributes," "data members," "member variables,"
     *             and "instance variables" all refer to variables declared within a class that define
     *             the state of an object.
     *      behavior (actions/functions/instance methods/member methods inside a class)
     *      A class is a logical entity and does not consume memory until an object is created.
     *      A Java Class can contain:
     *          Fields (instance variables)
     *          Methods (instance methods)
     *          Constructors (special methods for object initialization)
     *          Static and Instance Blocks (used for initialization)
     *          Nested Classes and Interfaces (inner classes, static nested classes, interfaces)
     *
     * Object
     *      An object is a real-word entity that has state and behaviour.
     *      An object is an instance of a class.
     *      An object is a basic unit in object-oriented programming (OOP).
     *      Objects are created from classes using the new keyword
     *      The new keyword is used to allocate memory at runtime.
     *      Each object has its own copy of the instance variables.
     * 		The dot (.) operator is used to access an object's variables and methods.
     * 	    All objects get memory in the Heap memory area.
     * Note:
     * 	  	A class can have multiple objects, each independent of the others.
     * 	Class Syntax:
     * 	 	class ClassName
     * 	 	        {
     * 		    // State (attributes/properties/fields)
     * 		    dataType field1;
     * 		    dataType field2;
     *
     * 		    // behavior (Methods/functions)
     * 		    returnType methodName(parameters) {
     * 		        // method body
     *            }        * 		}
     * 	Creating Objects Syntax:
     * 		ClassName objectName = new ClassName();
     *
     * 	Instance Variables
     * 		An Instance variables are variables declared inside a class but outside any method.
     * 		They are also known as member variables or fields or properties or attributes.
     * 		Each object has its own copy of instance variables, and they represent the state of that object.
     * 		Instance variables get initialized when the object is created.
     *  Instance Methods in Java
     * 		An instance method is a method that is associated with an instance of a class ( object).
     * 		They can access instance variables,static variables and other instance methods directly.
     * 		They can use this keyword to refer the current object.
     *
     * 	There are three ways to initialize object in Java.
     * 			By reference variable
     * 			By method
     * 			By constructor
     *
     */
    public static void main(String[] args) {
        System.out.println("OOPs concept, Class and Objects");
    }
}
