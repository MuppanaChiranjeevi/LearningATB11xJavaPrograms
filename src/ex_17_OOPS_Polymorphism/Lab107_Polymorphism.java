package ex_17_OOPS_Polymorphism;

public class Lab107_Polymorphism {
    /**
     * Polymorphism is one of the fundamental principles of object-oriented programming (OOP)
     * that allows objects of different classes to be treated as objects of a common superclass.
     *
     * Polymorphism is derived from 2 Greek words: poly and morphs. The word "poly"
     * means many and "morphs" means forms. So, polymorphism means many forms.
     *
     * There are two types of polymorphism in Java:
     * 1.Compile-time Polymorphism (Static Polymorphism / early binding)
     * Achieved through method overloading
     * The decision about which method to call is made at compile time
     *
     * 2.Runtime Polymorphism (Dynamic Polymorphism / late binding)
     * Achieved through method overriding
     * Requires inheritance
     * The decision about which method to call is made at runtime
     *
     * Method Overloading allows multiple methods with the same name within the same class
     * but different parameter lists (different type, number, or order of parameters).
     * Method Overloading is not possible by changing the return type of the method only.
     * Return types do not affect overloading.
     *
     * Method Overriding occurs when a subclass provides a specific implementation of a
     * method that is already defined in its parent class.
     * Rules for Method Overriding:
         * Must have same name and parameters as parent method
         * Return type should be same or covariant (subtype)
         * There must be an IS-A relationship (inheritance)
         * Cannot override static, final or private methods
         * Overriding method cannot have more restrictive access modifier
     *
     *
     */
    public static void main(String[] args) {
        System.out.println("Polymorphism Notes");
    }
}
