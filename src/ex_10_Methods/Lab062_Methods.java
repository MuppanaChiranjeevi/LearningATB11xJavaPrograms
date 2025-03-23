package ex_10_Methods;

import java.util.Scanner;

public class Lab062_Methods {

    //user defined method
    public static void findEvenOdd(int num)
    {
        if(num%2==0)
            System.out.println(num+" is even");
        else
            System.out.println(num+" is odd");
    }
    public static void main (String args[])
    {

        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number: ");

        int num=scan.nextInt();

        findEvenOdd(num);
    }
}
