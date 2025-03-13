package ex_03_Operators;

public class Lab020_UnaryOperators {

    public static void main(String[] args) {
        // Declare a variable
        int num = 5;

        // Unary plus operator
        int result = +num;
        System.out.println("Unary plus: +num = " + result); // Output: 5

        // Unary minus operator
        result = -num;
        System.out.println("Unary minus: -num = " + result); // Output: -5

        // Increment operator (prefix)
        result = ++num;
        System.out.println("Increment (prefix): ++num = " + result); // Output: 6

        // Increment operator (postfix)
        result = num++;
        System.out.println("Increment (postfix): num++ = " + result); // Output: 6
        System.out.println("Value of num after postfix increment: " + num); // Output: 7

        // Decrement operator (prefix)
        result = --num;
        System.out.println("Decrement (prefix): --num = " + result); // Output: 6

        // Decrement operator (postfix)
        result = num--;
        System.out.println("Decrement (postfix): num-- = " + result); // Output: 6
        System.out.println("Value of num after postfix decrement: " + num); // Output: 5

        // Logical NOT operator
        boolean isTrue = true;
        boolean isFalse = !isTrue;
        System.out.println("Logical NOT: !isTrue = " + isFalse); // Output: false
    }
}
