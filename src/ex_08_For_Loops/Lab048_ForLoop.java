package ex_08_For_Loops;
import java.util.Scanner;

public class Lab048_ForLoop  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        for(int i=0;i<=number;i++)
        if (i % 2 == 0) {
            System.out.println(i + " is even.");
        } else {
            System.out.println(i + " is odd.");
        }
    }
}

