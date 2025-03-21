package ex_09_While_Do_While;

import java.util.Scanner;

public class Lab052_While_Loop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=scanner.nextInt();
        int i=1,sum=0;
        while(i<=num){
            sum=sum+i;
            i++;
        }
        System.out.println("Sum of first "+ num +"is: "+sum);
    }
}
