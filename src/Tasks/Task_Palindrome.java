package Tasks;

import java.util.Scanner;

public class Task_Palindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=scanner.nextLine().toLowerCase();
        // Remove non-alphabetic characters and spaces
        str = str.replaceAll("[^a-zA-Z]", "");
        boolean flag = true;
        for (int i=0;i<str.length()/2;i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
            }
        }
    }

