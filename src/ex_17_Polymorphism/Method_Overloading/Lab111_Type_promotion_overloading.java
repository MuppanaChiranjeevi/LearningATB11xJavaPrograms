package ex_17_Polymorphism.Method_Overloading;

public class Lab111_Type_promotion_overloading {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.show(10);      // Exact match - calls show(int)
        obj.show(10.5);    // Exact match - calls show(double)
        obj.show('A');     // char promoted to int - calls show(int)
        obj.show(10.2f);   // float promoted to double - calls show(double)

    }
}
class Demo {
    void show(int a) {
        System.out.println("int method: " + a);
    }

    void show(double a) {
        System.out.println("double method: " + a);
    }
}


