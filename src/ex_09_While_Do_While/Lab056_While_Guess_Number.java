package ex_09_While_Do_While;

import java.util.Random;
import java.util.Scanner;

public class Lab056_While_Guess_Number {
    public static void main(String[] args) {

        Random random=new Random();
        // Generate a random number between 1 and 100
        int numberToGuess=random.nextInt(100)+1; // generates numbers from 1 to 100 (inclusive)

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it!");

        Scanner scanner=new Scanner(System.in);

        int userGuess=0, attempts=0;

        while (true){  //we can also use -> while (userGuess!=numberToGuess)
            System.out.print("Enter your guess: ");
            userGuess=scanner.nextInt();
            attempts++;
            if(userGuess>numberToGuess){
                System.out.println("Too High! Try Again");

            }
            else if(userGuess<numberToGuess){
                System.out.println("Too Low! Try Again");

            }
            else{
                System.out.println("Congratulations! You guessed the correct number in "+attempts+" attempts");
                break;
            }
        }
        System.out.println("Game Over!");
        scanner.close();

    }
}
