package ex_08_Loops;

import java.util.Scanner;

public class Lab50_ForLoop_Continue_Break {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        for (int i=1;i<=number;++i){


            if(i == number/3){
                continue; // skip below code, move to top
                // skip current iteration and continue with the next iteration
            }
            if(i == number/2){
                break;// terminates the loop immediately
            }
            System.out.println(i);
        }

        System.out.println("-------------------------------------");

        for (int i=1;i<=number;++i){
            if(i%2==0){
                System.out.println("Even: "+i);
                continue;
            }
            System.out.println("Odd: "+i);
        }
    }
}
