package ex_17_OOPS_Polymorphism.Method_Overriding;

public class Lab113_Method_Overriding {
    /**
     * Method Overriding in Java
     * Method overriding allows a subclass to provide a specific implementation of a method
     * that is already defined in its superclass.
     *
     * Key Rules for Method Overriding
         * The method must have the same name, return type, and parameters  as in the parent class
         * There must be an IS-A relationship (inheritance)
         * The overriding method cannot have a more restrictive access modifier
     * Constructors cannot be overridden
     * A static method cannot be overridden.
     * Cannot override static, final or private methods
     * Parent class's overridden method can be called using super.methodName()
     *
     * This enables dynamic method dispatch.
     * Dynamic method dispatch is a technique used in runtime polymorphism where the method that gets called is determined by the object type at runtime.
     */
    public static void main(String[] args) {
        Animal a = new Animal();  // Reference and object of Animal
        a.sound();  // Output: Animal makes a sound

        Dog d = new Dog();        // Reference and object of Dog
        d.sound();  // Output: Dog barks

        Animal ad = new Dog();    // Reference of Animal, object of Dog --> Dynamic dispatch
        ad.sound();  // Output: Dog barks (runtime polymorphism)
    }
}

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Overriding the sound() method of Animal
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

