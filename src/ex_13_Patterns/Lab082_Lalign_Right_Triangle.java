package ex_13_Patterns;

import java.util.Scanner;

public class Lab082_Lalign_Right_Triangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the num of rows : ");
        int num=sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println("------------------");
        for (int i = 1; i <= num ; i++) {
            System.out.print(" * ".repeat(i));
            System.out.println();
        }
        System.out.println("----------------------------");
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println("----------------------------");
        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        sc.close();
    }
}
