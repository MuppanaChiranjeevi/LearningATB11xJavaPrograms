package ex_10_Methods;

public class Lab063_Method_Types {
    /*
    Below are the four types of methods categorized based on whether they take parameters (inputs)
    and whether they return a value.

    Method Without Parameters and Without Return Type
    Method Without Parameters and With Return Type
    Method With Parameters and With Return Type
    Method With Parameters and Without Return Type
    */
    public static void main(String[] args) {
        // Calling the method
        printMessage();
        printMessage();
        printMessage();
        printMessage();

        System.out.println("-------------------------------");

        // Calling the method and storing the returned value
        int result = getSum();
        System.out.println("The sum is: " + result);
        System.out.println("The sum is: " + getSum());

        System.out.println("-------------------------------");

        int sum = add(5, 3); // passes 5 and 3 as parameters
        System.out.println("Sum: " + sum);

        System.out.println("Sum: " + add(7, 9));
        System.out.println("Sum: " + add(3, 6));

        System.out.println("-------------------------------");

        printSum(5, 3);
        printSum(4, 9);
        printSum(52, 13);
        printSum(69, 96);
        printSum(27, 43);


    }
    // Method without parameters and without return type
    public static void printMessage() {
        System.out.println("Hello, World!");
    }
    // Method without parameters and with return type
    public static int getSum() {
        int a = 5;
        int b = 3;
        return a + b; // returns the sum of a and b
    }
    // Method with parameters and return type
    public static int add(int a, int b) {
        return a + b; // returns the sum of a and b
    }
    // Method with parameters but without return type
    public static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println("The sum is: " + sum);
    }

}
