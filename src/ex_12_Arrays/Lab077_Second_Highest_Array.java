package ex_12_Arrays;

import java.util.Scanner;

public class Lab077_Second_Highest_Array {


    public static void main(String[] args) {
        // Scanner for input
        Scanner sc = new Scanner(System.in);

        // Taking the array size as input
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Taking array elements as input
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find second highest number
        int firstHighest = 0;
        int secondHighest = 0;

        for (int i = 0; i < n; i++) {
            // Update first and second highest accordingly
            if (arr[i] > firstHighest) {
                secondHighest = firstHighest;
                firstHighest = arr[i];
            } else if (arr[i] > secondHighest && arr[i] != firstHighest) {
                secondHighest = arr[i];
            }
        }


            System.out.println("The second highest number is: " + secondHighest);

        sc.close();
    }
}
