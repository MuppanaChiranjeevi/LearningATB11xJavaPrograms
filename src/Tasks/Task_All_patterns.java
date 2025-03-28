package Tasks;

import java.util.Scanner;

public class Task_All_patterns {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Num of rows: ");
        int rows= sc.nextInt();
        for (int i = 1; i <= rows ; i++) {
            for (int j = 1; j <= rows ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------");
        for (int i = 1; i <= rows ; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------");
        for (int i = rows; i >=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println("---------------------------------------------");
        for (int i = 1; i <=rows ; i++) {
            for (int j = 1; j <=rows ; j++) {
                if(j<=rows-i){
                    System.out.print("   ");
                }
                else {
                    System.out.print(" * ");
                }
            }
            System.out.println();

        }
        System.out.println("---------------------------------------------");
        for (int i = rows; i >=1 ; i--) {
            for (int j = 1; j <=rows ; j++) {
                if(j<=rows-i){
                    System.out.print("   ");
                }
                else {
                    System.out.print(" * ");
                }
            }
            System.out.println();

        }
        System.out.println("---------------------------------------------");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows-i ; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= 2*i-1 ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------");
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= rows-i ; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= 2*i-1 ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows-i ; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= 2*i-1 ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        for (int i = rows-1; i >= 1; i--) {
            for (int j = 1; j <= rows-i ; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= 2*i-1 ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}

