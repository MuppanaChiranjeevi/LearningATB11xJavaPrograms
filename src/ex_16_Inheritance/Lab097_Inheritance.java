package ex_16_Inheritance;

// Superclass (Parent class)
class Animal {
    String name = "Animal"; // Inherited attribute

    void eat() {  // Inherited method
        System.out.println(name + " eats food.");
    }
}

// Subclass (Child class)
class Dog extends Animal {
    String breed = "Labrador"; // Specific attribute of Dog class

    void bark() { // Specific method of Dog class
        System.out.println("Dog barks.");
    }
}

// Main class
public class Lab097_Inheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        // Accessing inherited attributes and methods
        System.out.println("Name: " + myDog.name); // Inherited attribute
        myDog.eat(); // Inherited method

        // Accessing subclass-specific attributes and methods
        System.out.println("Breed: " + myDog.breed); // Specific attribute of Dog class
        myDog.bark(); // Specific method of Dog class
    }
}
