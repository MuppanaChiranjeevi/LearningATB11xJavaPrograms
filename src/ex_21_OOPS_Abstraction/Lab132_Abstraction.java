package ex_21_OOPS_Abstraction;

public class Lab132_Abstraction {
    /**
     * Abstraction is one of the four fundamental principles of object-oriented programming (OOP)
     * in Java (along with encapsulation, inheritance, and polymorphism).
     * Abstraction is a process of hiding the implementation details and showing only essential features to the user.
     * Abstraction is a process of hiding the implementation details and showing only functionality to the user.
     * There are two ways to achieve abstraction in Java:
     * Using Abstract Class (0 to 100%)
     * Using Interface (100%)
     *
     * An abstract class in Java is a class that cannot be instantiated (i.e., you can't create objects from it directly).
     * It may contain both abstract methods (without implementation) and concrete methods (with implementation).
     * It is used as a base class for other classes.
     * Think of it as a partially implemented blueprint.
     * Key Characteristics of Abstract Classes:
     * Cannot be instantiated - You can't create objects of abstract classes
     * Can contain abstract methods - Methods without implementation
     * Can contain concrete methods - Regular methods with implementation
     * Can have constructors - Even though you can't instantiate them directly
     * Can have fields - Both static and non-static
     * can have methods - Both static(main method) and non-static
     * Used as base classes - Must be extended by subclasses
     *
     * Points to Remember
     * If a class contains at least one abstract method, the class should be abstract.
     * A class can be made abstract even without any abstract methods.
     * Abstract class cannot be instantiated.
     * An abstract class can have fields (Both static and non-static), abstract method, non-abstract,
     * constructor,and static methods(main-method).
     * It can have final methods which will force the subclass not to change the body of the method.
     * Concrete (non-abstract) classes which extend an abstract class must implement all the abstract methods.
     * Otherwise, they should be made abstract as well.
     *
     * Abstract methods (methods without a body)
     * These do not have a body (no {}).
     * Declared with the abstract keyword.
     * Must be implemented by the concrete subclass.
     * Only allowed in abstract classes or interfaces.
     *
     * Concrete methods (methods with a body)
     * These have a body – full implementation with {}.
     * Can be declared in any class (abstract or not).
     */
    public static void main(String[] args) {
//        Animal myAnimal = new Animal(); // Can't be instantiated
        Animal myDog = new Dog(); // Polymorphism
        Animal myCat = new Cat();

        myDog.makeSound(); // Outputs: Woof!
        myDog.eat();       // Outputs: This animal eats food.

        myCat.makeSound(); // Outputs: Meow!
        myCat.eat();       // Outputs: This animal eats food.
    }
}
// Abstract class
abstract class Animal {
    // Abstract method
    abstract void makeSound();

    // Concrete method
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass (inherits from Animal)
class Dog extends Animal {
    // Implementing the abstract method
    void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow!");
    }
}

