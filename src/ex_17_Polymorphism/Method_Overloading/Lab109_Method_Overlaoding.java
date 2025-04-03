package ex_17_Polymorphism.Method_Overloading;
// Method Overloading with Different Number of Parameters
public class Lab109_Method_Overlaoding {
    public static void main(String[] args) {
        Calculator2 calc = new Calculator2();
        System.out.println("Sum of two numbers: " + calc.add(5, 10));  // Calls add(int, int)
        System.out.println("Sum of three numbers: " + calc.add(7.9, 10.4));  // Calls add(double, double)

        calc.print(10);            // Calls print(int)
        calc.print(5.5);           // Calls print(double)
        calc.print("Hello");      // Calls print(String)
    }
}
class Calculator2 {
    // Method with two parameters
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with three parameters
    double add(double a, double b) {
        return a + b;
    }

    // Method to print an integer
    void print(int num) {
        System.out.println("Printing int: " + num);
    }

    // Overloaded method to print a double
    void print(double num) {
        System.out.println("Printing double: " + num);
    }

    // Overloaded method to print a string
    void print(String text) {
        System.out.println("Printing String: " + text);
    }
}




