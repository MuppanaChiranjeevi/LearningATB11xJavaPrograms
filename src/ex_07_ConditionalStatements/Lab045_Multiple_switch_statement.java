package ex_07_ConditionalStatements;

import java.util.Scanner;

public class Lab045_Multiple_switch_statement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value to find month of the year: ");
        int month= sc.nextInt();
        switch (month){
            case 1:
            case 2:
            case 3:
                System.out.println("First Quarter");
                break;
            case 4,5,6:
                System.out.println("Second Quarter");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Third Quarter");
                break;
            case 10,11,12:
                System.out.println("Fourth Quarter");
                break;
            default:
                System.out.println("Invalid Month");

        }

        switch (month){
            case 1,2,3 -> System.out.println("First Quarter");
            case 4,5,6 -> System.out.println("Second Quarter");
            case 7,8,9 -> System.out.println("Third Quarter");
            case 10,11,12 -> System.out.println("Fourth Quarter");
            default -> System.out.println("Invalid Month");

        }
    }
}
