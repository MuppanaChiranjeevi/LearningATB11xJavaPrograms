package ex_16_OOPS_Inheritance.Single_Inheritance;

public class Lab098_Main {
    /*
     Single inheritance: A subclass inherits from only one parent class (called the superclass)
     */
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
//        animal.brak();
        System.out.println("-----------------");
        Dog dog = new Dog();
        dog.eat(); // Calling method from parent class
        dog.bark(); // Calling method from child class
        System.out.println("-----------------");
        Animal myDog = new Dog();
        myDog.eat();
//        myDog.bark();
    }
}
// Parent class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class (inherits from Animal)
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}


