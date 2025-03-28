package Tasks;

import java.util.Scanner;

public class Task_Even_Odd_Array {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the Size of an array: ");
        int size=sc.nextInt();
        int[] num=new int[size];

        System.out.println("Enter the "+size+" elements:");
        for (int i = 0; i < num.length; i++) {
            num[i]= sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            if(num[i]%2==0){
                System.out.println(num[i]+" is even");
            }
            else {
                System.out.println(num[i]+" is odd");
            }
        }
    }
}
