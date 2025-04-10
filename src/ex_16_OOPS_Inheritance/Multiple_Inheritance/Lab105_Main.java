package ex_16_OOPS_Inheritance.Multiple_Inheritance;

public class Lab105_Main {
    public static void main(String[] args) {
        C c= new C();
        c.show();
    }

}

interface A {
    default void show() {
        System.out.println("A");
    }
}

interface B {
    default void show() {
        System.out.println("B");
    }
}

class C implements A, B {

    public void show() {
        A.super.show();
        B.super.show();

    }
}