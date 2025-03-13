package ex_03_Operators;

public class Lab018_ComparisonOperators {
        public static void main(String[] args) {
            // Declare variables
            int a = 10;
            int b = 5;
            int c = 10;

            // Using the '==' (Equal to) operator
            System.out.println("a == b: " + (a == b));  // false
            System.out.println("a == c: " + (a == c));  // true

            // Using the '!=' (Not equal to) operator
            System.out.println("a != b: " + (a != b));  // true
            System.out.println("a != c: " + (a != c));  // false

            // Using the '>' (Greater than) operator
            System.out.println("a > b: " + (a > b));  // true
            System.out.println("b > a: " + (b > a));  // false

            // Using the '<' (Less than) operator
            System.out.println("a < b: " + (a < b));  // false
            System.out.println("b < a: " + (b < a));  // true

            // Using the '>=' (Greater than or equal to) operator
            System.out.println("a >= b: " + (a >= b));  // true
            System.out.println("a >= c: " + (a >= c));  // true

            // Using the '<=' (Less than or equal to) operator
            System.out.println("a <= b: " + (a <= b));  // false
            System.out.println("a <= c: " + (a <= c));  // true
        }


}
