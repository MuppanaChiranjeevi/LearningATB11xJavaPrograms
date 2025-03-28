package ex_12_Arrays;

import java.util.Scanner;

public class Lab075_MAX_MIN_SUM {
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
        System.out.println("Maximum num is: "+getMAX(numbers));
        System.out.println("Minimum num is: "+getMIN(numbers));
        System.out.println("Sum is: "+getSum(numbers));

    }

    static int getMAX(int[] numbers) {
        int max=numbers[0];
        for (int num:numbers){
            if(num>max){
                max=num;
            }
        }
        return max;
    }
    static  int getMIN(int[] numbers){
        int min=numbers[0];
        for (int num:numbers){
            if(num<min){
                min=num;
            }
        }
        return min;
    }
    static int getSum(int[] numbers){
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }


}
