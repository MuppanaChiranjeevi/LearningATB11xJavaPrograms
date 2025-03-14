package ex_05_TernaryOperator;

public class Lab031_TernaryOperator {
    public static void main(String[] args) {
        /**
         * In Java, the ternary operator is a shorthand for an if-else statement.
         * It is a conditional operator that takes three operands, hence the name ternary.
         * The syntax for the ternary operator is:
         *     condition ? expression1 : expression2;
         * condition: This is the boolean expression that is evaluated.
         *            If it is true, expression1 is returned.
         *            If it is false, expression2 is returned.
         * expression1: The value returned if the condition is true.
         * expression2: The value returned if the condition is false.
         */

        int a = 5, b = 10;

        // Using the ternary operator
        String result = (a > b) ? "a is greater" : "b is greater";

        System.out.println(result);
//        In this example:
//        The condition is (a > b).
//        Since a is 5 and b is 10, the condition evaluates to false, so the ternary operator returns "b is greater".
    }
}
