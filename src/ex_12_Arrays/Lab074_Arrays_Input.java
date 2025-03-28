package ex_12_Arrays;

import java.util.Scanner;

public class Lab074_Arrays_Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size=sc.nextInt();
        int[] num=new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the "+i+" element: ");
            num[i]=sc.nextInt();

        }
        System.out.println("----Entered array -----");
        for(int j:num){
            System.out.println(j);
        }
        System.out.println("----Entered array in reverse order ----");
        for (int i = num.length-1; i >=0 ; i--) {
            System.out.println(num[i]);

        }

    }
}
