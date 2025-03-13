package ex_03_Operators;

public class Lab019_AssignmentOperators {
    public static void main(String[] args) {
        // Declare some variables
        int a = 10;
        int b = 5;

        // Using the simple assignment operator
        int c = a;
        System.out.println("c = a: " + c); // Output: 10

        // Using the addition assignment operator
        c += b;
        System.out.println("c += b: " + c); // Output: 15 (c = 10 + 5)

        // Using the subtraction assignment operator
        c -= b;
        System.out.println("c -= b: " + c); // Output: 10 (c = 15 - 5)

        // Using the multiplication assignment operator
        c *= b;
        System.out.println("c *= b: " + c); // Output: 50 (c = 10 * 5)

        // Using the division assignment operator
        c /= b;
        System.out.println("c /= b: " + c); // Output: 10 (c = 50 / 5)

        // Using the modulus assignment operator
        c %= b;
        System.out.println("c %= b: " + c); // Output: 0 (c = 10 % 5)

        // Using the compound assignment operator
        c = a; // Reset c to 10
        c += 7;
        System.out.println("c += 7: " + c); // Output: 17 (c = 10 + 7)

        // Another example with multiplication
        c *= 2;
        System.out.println("c *= 2: " + c); // Output: 34 (c = 17 * 2)

        // Another example with subtraction
        c -= 4;
        System.out.println("c -= 4: " + c); // Output: 30 (c = 34 - 4)
    }
}
