package ex_07_ConditionalStatements;

import java.util.Scanner;

public class Lab043_switch_statement_nobreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day num(1 to 7): ");
        int day = scanner.nextInt();

        switch (day) {

            case 1:
                System.out.println("Mon");

            case 2:
                System.out.println("Tue");

            case 3:
                System.out.println("Wed");
            case 4:
                System.out.println("Thu");
            case 5:
                System.out.println("Fri");
            case 6:
                System.out.println("Sat");
            case 7:
                System.out.println("Sun");
            default:
                System.out.println("Invalid, day number");


        }
    }
}
