package ex_02_Java_Basics_part2;

public class Lab009_DataTypes_Variables {
        public static void main(String[] args) {
            // Integer data types
            byte smallNumber = 127;       // Max value for byte
            short shortNumber = 32_767;   // Using underscore for readability
            int normalNumber = 2_147_483_647;  // Max value for int
            long bigNumber = 9_223_372_036_854_775_807L;  // 'L' suffix for long

            // Floating-point data types
            float decimalValue = 3.1435f;   // 'f' suffix for float
            double preciseValue = 2.718281828459045;  // More precision

            // Character and Boolean
            char singleCharacter = 'A';   // Char stores a single character
            boolean isJavaFun = true;     // Boolean stores true/false

            // Valid Identifiers (Variable Names)
            int _$ = 25;                 // Simple variable name
            int _score = 90;              // Underscore at start (valid but uncommon)
            int $dollarValue = 100;       // Dollar sign in variable name
            int studentID = 12345;        // CamelCase naming
            int number123 = 500;          // Digits can be used after letters

            // Printing all variables
            System.out.println("Byte Value: " + smallNumber);
            System.out.println("Short Value: " + shortNumber);
            System.out.println("Int Value: " + normalNumber);
            System.out.println("Long Value: " + bigNumber);
            System.out.println("Float Value: " + decimalValue);
            System.out.println("Double Value: " + preciseValue);
            System.out.println("Char Value: " + singleCharacter);
            System.out.println("Boolean Value: " + isJavaFun);
            System.out.println("Age: " + _$);
            System.out.println("Score: " + _score);
            System.out.println("Dollar Value: " + $dollarValue);
            System.out.println("Student ID: " + studentID);
            System.out.println("Number123: " + number123);
        }


}
