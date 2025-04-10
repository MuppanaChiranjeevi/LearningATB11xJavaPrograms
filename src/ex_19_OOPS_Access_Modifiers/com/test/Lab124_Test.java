package ex_19_OOPS_Access_Modifiers.com.test;


import ex_19_OOPS_Access_Modifiers.com.example.MyClass;

public class Lab124_Test {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.x = 10; // Accessing public field
        obj.show(); // Accessing public method
        System.out.println("Value of x: " + obj.x);

        // Private variable and method
//         obj.y = 10; // Error: x has private access in MyClass
//         obj.setY(10); // Error: setX() has private access in MyClass
    }
}

