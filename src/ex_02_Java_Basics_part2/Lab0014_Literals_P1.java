package ex_02_Java_Basics_part2;

public class Lab0014_Literals_P1 {
    public static void main(String[] args) {

        /**
         * ## Literals
         * - Literals are the actual values assigned.
         * - **int age = 65; -> 65.**
         * - Literals can be Numeric and Non Numeric.
         */
        // Literal
        int age = 65;
        age = 66;

        // Constant
        final int girl_age = 18;
        //girl_age = 19;

        System.out.println(age);
        System.out.println(girl_age);

        int Age = 65; // Decimal System - base wil 10

        // Binary Literal
        int binary_num = 0b1100100; // Decimal System - 10

        System.out.println(Age);
        System.out.println(binary_num);

        char ascii=67;
        System.out.println(ascii);
    }
}
