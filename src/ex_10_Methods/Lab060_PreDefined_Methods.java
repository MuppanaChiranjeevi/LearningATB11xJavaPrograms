package ex_10_Methods;

public class Lab060_PreDefined_Methods {
    public static void main(String[] args) {
        // Absolute value
        int num1 = -25;
        double num2 = -8.6;
        System.out.println("Absolute value of " + num1 + " = " + Math.abs(num1));
        System.out.println("Absolute value of " + num2 + " = " + Math.abs(num2));

        // Square root
        double squareRoot = Math.sqrt(16);
        System.out.println("Square root of 16 = " + squareRoot);

        // Power (num1 raised to the power of num2)
        double power = Math.pow(2, 3); // 2^3
        System.out.println("2 raised to the power of 3 = " + power);

        // Random number generation
        double randomValue = Math.random(); // Generates a random number between 0 and 1
        System.out.println("Random value between 0 and 1 = " + randomValue);

        // Maximum and minimum
        int max = Math.max(10, 20);
        int min = Math.min(10, 20);
        System.out.println("Maximum of 10 and 20 = " + max);
        System.out.println("Minimum of 10 and 20 = " + min);

        // Rounding
        double roundValue = Math.round(8.6);
        System.out.println("Rounded value of 8.6 = " + roundValue);

        // Ceiling and floor functions
        double ceilValue = Math.ceil(3.2);  // Rounds up
        double floorValue = Math.floor(3.8);  // Rounds down
        System.out.println("Ceiling of 3.2 = " + ceilValue);
        System.out.println("Floor of 3.8 = " + floorValue);
    }
}

