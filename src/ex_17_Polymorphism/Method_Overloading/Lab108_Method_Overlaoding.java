package ex_17_Polymorphism.Method_Overloading;
// Method Overloading with Different types of parameters
public class Lab108_Method_Overlaoding {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum of two numbers: " + calc.add(5, 10));  // Calls add(int, int)
        System.out.println("Sum of three numbers: " + calc.add(5, 10, 15));  // Calls add(int, int, int)
    }
}
class Calculator {
    // Method with two parameters
    int add(int a, int b) {
        return a + b;
    }


    // Overloaded method with three parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }
}




