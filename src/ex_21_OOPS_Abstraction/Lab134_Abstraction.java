package ex_21_OOPS_Abstraction;

public class Lab134_Abstraction {

}
// Abstract class
abstract class Animal1 {
    // Non-static field (instance variable)
    int age;

    // Static field (shared across all instances)
    static String species = "Mammal";

    // Constructor
    Animal1(int age) {
        this.age = age;
        System.out.println("Animal constructor called, Age: " + this.age);
    }

    // Abstract method (must be implemented by subclasses)
    abstract void makeSound();

    // Non-abstract method (concrete method)
    void sleep() {
        System.out.println("Animal is sleeping.");
    }

    // Static method (can be called without creating an object)
    static void animalInfo() {
        System.out.println("Animals are part of the Animalia kingdom.");
    }

    // Main method (starting point of the program)
    public static void main(String[] args) {
        System.out.println("Main method Inside abstract class.");
        animalInfo();  // or Animal1.animalInfo();  Calling the static method

        // Can't instantiate the abstract class directly:
        // Animal a = new Animal(5); // This will cause a compilation error.

        // Instantiating a subclass (Dog) which implements the abstract method
        Dog1 dog1 = new Dog1(3);
        dog1.makeSound(); // Calls the implemented method
        dog1.sleep();     // Inherited from Animal class
        dog1.run();     // calls own method

        System.out.println("Age of dog: " + dog1.age); // Accessing non-static field
        System.out.println("Species: " + Animal1.species); // Accessing static field
    }
}

// Concrete subclass of Animal
class Dog1 extends Animal1 {
    // Constructor for Dog class
    Dog1(int age) {
        super(age);  // Calls the constructor of Animal
        System.out.println("Dog constructor called.");
    }

    // Implementing the abstract method
    void makeSound() {
        System.out.println("Woof! Woof!");
    }
    void run(){
        System.out.println("Dog is running");
    }

}
