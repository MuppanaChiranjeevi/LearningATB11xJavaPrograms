package ex_16_Inheritance.Multiple_Inheritance;

public class Lab106_Main {
    public static void main(String[] args) {
        Cc obj = new Cc();
        obj.details();
        obj.display();
        obj.show();

    }
}
interface Aa {
    default void show() {
        System.out.println("Show method from Interface Aa");
    }
    void details();
}

interface Bb {
    default void show() {
        System.out.println("Show method from Interface Bb");
    }
    void display();
}

// Class implementing multiple interfaces
class Cc implements Aa, Bb {


    public void display() {
        System.out.println("Display method from Interface Bb");
    }

    public void details() {
        System.out.println("details method from Interface Aa");
    }

    @Override
    public void show() {
        Aa.super.show();
        Bb.super.show();
    }
}

