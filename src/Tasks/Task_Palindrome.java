package Tasks;

import java.util.Scanner;

public class Task_Palindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String inputStr=scanner.next().toLowerCase();
        String reversedString=reverseString(inputStr); // calling reverseString method

        if (inputStr.equals(reversedString)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
            }
        }

    private static String reverseString(String inputStr) {
        String revString="";
        for (int i=inputStr.length()-1;i>=0;i--){
            revString=revString + inputStr.charAt(i);
        }
        return revString;
    }
}

