package ex_02_Java_Basics_part2;

public class Lab0013_Multiple_Variables {
        public static void main(String[] args) {
            // Declaring multiple variables of the same type in a single line
            byte a = 10, b = 20, c = 30;
            short x = 1000, y = 2000;
            int num1 = 50, num2 = 60, num3 = 70;
            long big1 = 100000L, big2 = 200000L;

            // Multiple floating-point variables
            float pi = 3.14f, gravity = 9.8f;
            double price = 99.99, tax = 8.25;

            // Multiple character and boolean variables
            char letter1 = 'A', letter2 = 'B', letter3 = 'C';
            boolean isJavaEasy = true, isFun = true;

            // Printing values
            System.out.println("Byte Values: " + a + ", " + b + ", " + c);
            System.out.println("Short Values: " + x + ", " + y);
            System.out.println("Int Values: " + num1 + ", " + num2 + ", " + num3);
            System.out.println("Long Values: " + big1 + ", " + big2);
            System.out.println("Float Values: " + pi + ", " + gravity);
            System.out.println("Double Values: " + price + ", " + tax);
            System.out.println("Char Values: " + letter1 + ", " + letter2 + ", " + letter3);
            System.out.println("Boolean Values: " + isJavaEasy + ", " + isFun);
        }


}
