package Tasks;

import java.util.Scanner;

public class Task_Even_Odd {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();

        if (num%2==0){
            System.out.println("The Number "+num+" is even");
        }
        else {
            System.out.println("The Number "+num+" is odd");
        }

    }
}
