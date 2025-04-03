//package ex_16_Inheritance.Multiple_Inheritance;
//
//public class Lab104_Multiple_Inheritance {
//    /*
//    Multiple Inheritance (through Interfaces): A subclasses inherits from  more than one superclass, it is known as multiple inheritance.
//     *  Note: Java does not support multiple inheritance with classes to avoid ambiguity  and complexity caused by the Diamond Problem,
//     *        but allows it through interfaces.
//     *  The Diamond Problem: If two parent classes have the same method,
//        it creates ambiguity about which version the child class should inherit.
//     */
//    public static void main(String[] args) {
//        C obj = new C();
//        obj.show();  // Ambiguity: Should it call A's show() or B's show()?
//    }
//}
//class A {
//    void show() {
//        System.out.println("Class A");
//    }
//}
//
//class B {
//    void show() {
//        System.out.println("Class B");
//    }
//}
//
//
//class C extends A, B {  // Not Allowed in Java
//    // Which 'show()' method should C inherit? A's or B's?
//}
//
//
