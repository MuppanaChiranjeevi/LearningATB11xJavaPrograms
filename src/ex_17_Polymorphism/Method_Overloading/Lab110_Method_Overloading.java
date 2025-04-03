package ex_17_Polymorphism.Method_Overloading;

// Method Overloading with Different Order of Parameters
public class Lab110_Method_Overloading {
    public static void main(String[] args) {
        Student student = new Student();
        student.display("Alice", 20);  // Calls first display method
        student.display(25, "Bob");    // Calls second display method

        student.show(10, "Java");  // Calls show(int, String)
        student.show("Method Overloading", 20);  // Calls show(String, int)
    }
}
class Student {
    // Method with parameters (String, int)
    void display(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Overloaded method with parameters (int, String)
    void display(int age, String name) {
        System.out.println("Age: " + age + ", Name: " + name);
    }
    // Method with (int, String) parameters
    void show(int a, String b) {
        System.out.println("Integer: " + a + ", String: " + b);
    }

    // Overloaded method with (String, int) parameters
    void show(String b, int a) {
        System.out.println("String: " + b + ", Integer: " + a);
    }
}

