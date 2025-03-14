package ex_07_ConditionalStatements;

import java.util.Scanner;

public class Lab041_if_else_Statement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = sc.nextInt();

        if (age<0){
            System.out.println("please enter age correctly");
        }
        else if (age<18){
            System.out.println("Not eligible for vote");
        }
        else{
            System.out.println("Eligible for vote");
        }
    }
    /**
     * **Debug** a Program in Java
     * - Step by Step execution to see the results.
     * - To find the issues(we can run the program line by line).
     * - Rule -> Add **breaking point** (red) by clicking on the number -> **condition.**
     */

}
