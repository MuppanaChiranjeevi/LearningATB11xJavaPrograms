package Tasks;

import java.util.Scanner;

public class Task_Second_Highest_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size=sc.nextInt();

        int[] numbers=new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element at index " + i + ": ");
            numbers[i]=sc.nextInt();

        }
        sc.close();
        int first_highest=0;
        int second_highest=0;
        for(int num:numbers)
        {
            if (num>first_highest)
            {
                second_highest=first_highest;
                first_highest=num;
            }
            else if (num>second_highest && num != first_highest)
            {
                second_highest=num;
            }
        }
        System.out.println("The Second Highest number in given array is: "+second_highest);
    }
}
