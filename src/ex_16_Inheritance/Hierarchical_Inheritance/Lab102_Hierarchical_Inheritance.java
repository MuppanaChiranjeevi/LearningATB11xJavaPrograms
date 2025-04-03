package ex_16_Inheritance.Hierarchical_Inheritance;

public class Lab102_Hierarchical_Inheritance {
    /*
     multiple child classes inherit from a single parent class.
     or
     a single parent class is inherited by multiple child classes.

     Each subclass inherits properties and methods from the same parent
     */
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Inherited from Animal
        dog.bark(); // Dog specific method

        System.out.println("-----------------");

        Cat cat = new Cat();
        cat.eat();  // Inherited from Animal
        cat.meow(); // Cat specific method
    }
}

// Parent class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class 1
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Child class 2
class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");
    }
}

