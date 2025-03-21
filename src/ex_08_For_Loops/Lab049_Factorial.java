package ex_08_For_Loops;

import java.util.Scanner;

public class Lab049_Factorial {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num= scanner.nextInt();
        int fact=1;
        if (num < 0) {
            // Factorial is not defined for negative numbers
            System.out.println("Factorial is not defined for negative numbers.");
        }
        else if (num == 0 || num == 1) {
            // Factorial of 0 or 1 is always 1
            System.out.println("Factorial: " + fact);
        }
        else{
            for(int i=1;i<=num;i++){
                fact *= i;
            }
            System.out.println("Factorial: "+fact);
        }
    }
}
