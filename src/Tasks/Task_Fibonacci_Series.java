package Tasks;

import java.util.Scanner;

public class Task_Fibonacci_Series {
    /**
     *
     * The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones.
     *
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number for fibonacci series: ");
        int num = scanner.nextInt();
        int first=0,second=1,next;
        System.out.print("Fibonacci Series: ");
        for (int i=1;i <= num ; ++i){
            System.out.print(first+" ");
            next = first + second;
            first = second;
            second = next;

        }
        scanner.close();
    }
}
