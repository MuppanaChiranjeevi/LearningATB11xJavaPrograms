package ex_03_Operators;

public class Lab016_Operators {
    public static void main(String[] args) {
        /**
         * In Java, operators are special symbols that perform operations on variables and values.
         *
         * 1. Arithmetic Operators
         * + (Addition)
         * - (Subtraction)
         * * (Multiplication)
         * / (Division)
         * % (Modulus) --> Remainder
         *
         * 2. Relational (Comparison) Operators
         * These operators compare two values and return a boolean result (true or false).
         * == (Equal to)
         * != (Not equal to)
         * > (Greater than)
         * < (Less than)
         * >= (Greater than or equal to)
         * <= (Less than or equal to)
         *
         * 3. Logical Operators
         * These operators are used to perform logical operations, often with boolean values.
         * && (Logical AND) --> returns true if both operands are true
         * || (Logical OR)  --> returns true if at least one of the operands is true
         * ! (Logical NOT)  -->  inverts the value of the operand
         *
         * 4. Assignment Operators
         * These operators are used to assign values to variables.
         * = (Assigns the value on the right to the variable on the left)
         * +=: Adds the right operand to the left operand and assigns the result to the left operand.
         * -=: Subtracts the right operand from the left operand and assigns the result to the left operand.
         * *=: Multiplies the left operand by the right operand and assigns the result to the left operand.
         * /=: Divides the left operand by the right operand and assigns the result to the left operand.
         * %=: Takes the modulus (remainder) of the left operand divided by the right operand and assigns the result to the left operand.
         *
         * 5. Unary Operators
         * These operators operate on a single operand.
         * Unary Plus (+): This operator is used to indicate a positive value.
         *                 It doesn’t change the value but just emphasizes it is positive.
         *
         * Unary Minus (-): This operator is used to negate the value.
         *                  It changes a positive value to negative and vice versa.
         *
         * Increment (++):
         * Prefix Increment (++num): Increments the value of num before using it in an expression.
         * Postfix Increment (num++): Increments the value of num after using it in an expression.
         * Decrement (--):
         * Prefix Decrement (--num): Decrements the value of num before using it in an expression.
         * Postfix Decrement (num--): Decrements the value of num after using it in an expression.
         *
         * Logical NOT (!): This operator is used to reverse the boolean value.
         *                  If the value is true, it becomes false, and if it is false, it becomes true.
         *
         * 6. Bitwise Operators
         * These operators perform bit-level operations on integer data types.
         * & (Bitwise AND)
         * | (Bitwise OR)
         * ^ (Bitwise XOR)
         * ~ (Bitwise NOT)
         * << (Left shift)
         * >> (Right shift)
         * >>> (Unsigned right shift)
         *
         * 7. Ternary Operator
         * The ternary operator is a shorthand for an if-else statement. It works with three operands.
         * condition ? expression1 : expression2
         *
         * 8. Instanceof Operator
         * This operator is used to check if an object is an instance of a specific class or interface.
         * instanceof
         */
        System.out.println("Operator In Java:\n"+
                "In Java, operators are special symbols that perform operations on variables and values.");
        System.out.println("There are many types of operators in Java which are given below:\n" +
                "Unary Operator,\n" +
                "Arithmetic Operator,\n" +
                "Shift Operator,\n" +
                "Relational Operator,\n" +
                "Bitwise Operator,\n" +
                "Logical Operator,\n" +
                "Ternary Operator and\n" +
                "Assignment Operator.");
    }
}
