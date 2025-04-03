package ex_16_Inheritance.Multi_Level_Inheritance;

public class Lab101_Main {
    public static void main(String[] args) {
        Puppy myPuppy = new Puppy();

        // Puppy can access methods from all levels
        myPuppy.eat();   // Inherited from Animal
        myPuppy.bark();  // Inherited from Dog
        myPuppy.weep();  // Its own method
    }
}
// Level 1: Grandparent class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Level 2: Parent class inherits from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Level 3: Child class inherits from Dog
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping");
    }
}
