package ex_17_OOPS_Polymorphism.Method_Overriding;

public class Lab114_Method_Overriding {
    public static void main(String[] args) {
        Animal1 myAnimal = new Animal1();  // Animal object
        Animal1 myDog = new Dog1();       // Dog object
        Animal1 myCat = new Cat1();       // Cat object

        myAnimal.makeSound();  // Output: The animal makes a sound
        myDog.makeSound();     // Output: The dog barks: Woof woof!
        myCat.makeSound();     // Output: The cat meows: Meow meow!
    }
}
// Parent class
class Animal1 {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

// Child class overriding makeSound()
class Dog1 extends Animal1 {
    @Override
    public void makeSound() {
        System.out.println("The dog barks: Woof woof!");
    }
}

// Another child class with different implementation
class Cat1 extends Animal1 {
    @Override
    public void makeSound() {
        System.out.println("The cat meows: Meow meow!");
    }
}

