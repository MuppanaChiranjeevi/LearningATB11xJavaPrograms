package ex_09_While_Do_While;
import java.util.Scanner;
public class Lab058_do_while {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int sum = 0, i = 1;

        do {
            sum += i; // Adding i to sum
            i++;
        } while (i <= n); // Loop continues until i > n

        System.out.println("Sum of first " + n + " natural numbers: " + sum);

        scanner.close();
    }
}
