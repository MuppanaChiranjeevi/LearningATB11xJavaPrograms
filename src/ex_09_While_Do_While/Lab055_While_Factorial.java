package ex_09_While_Do_While;
import java.util.Scanner;

public class Lab055_While_Factorial {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");

        // Check if the input is an integer
        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();

            // Check if the number is negative
            if (num < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
            }
            else if (num == 0) {
                // Factorial of 0 is always 1
                System.out.println("Factorial of 0 is: " + 1);
            }
            else {

                int factorial = 1;
                int i = 1;
                while( i <= num ) {
                    factorial *= i; // factorial = factorial * i;
                    i++;
                }
                System.out.println("Factorial of " + num + " is: " + factorial);
            }
        } else {
            System.out.println("Invalid input! Please enter a valid integer.");
        }
        // Close the scanner
        scanner.close();
    }

}

