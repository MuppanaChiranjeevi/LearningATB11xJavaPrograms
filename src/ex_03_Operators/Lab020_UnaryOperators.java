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

        // Increment operator (pre Increment)
        result = ++num;
        System.out.println("Increment (prefix): ++num = " + result); // Output: 6

        // Increment operator (post Increment)
        result = num++;
        System.out.println("Increment (postfix): num++ = " + result); // Output: 6
        System.out.println("Value of num after postfix increment: " + num); // Output: 7

        // Decrement operator (pre Decrement)
        result = --num;
        System.out.println("Decrement (prefix): --num = " + result); // Output: 6

        // Decrement operator (post Decrement)
        result = num--;
        System.out.println("Decrement (postfix): num-- = " + result); // Output: 6
        System.out.println("Value of num after postfix decrement: " + num); // Output: 5

        // Logical NOT operator
        boolean isTrue = true;
        boolean isFalse = false;
        System.out.println("Logical NOT: !isTrue = " + !isTrue); // Output: false
        System.out.println("Logical NOT: !isFalse = " + !isFalse); // Output: true

        int a=10;
        int b=-10;
        boolean c=true;
        boolean d=false;
        System.out.println(~a);//-11 (minus of total positive value which starts from 0)
        System.out.println(~b);//9 (positive of total minus, positive starts from 0)
        System.out.println(!c);//false (opposite of boolean value)
        System.out.println(!d);//true
    }
}
