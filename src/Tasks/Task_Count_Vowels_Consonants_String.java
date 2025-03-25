package Tasks;

import java.util.Scanner;

public class Task_Count_Vowels_Consonants_String
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();
        inputString=inputString.toLowerCase();
        int vowels=0,consosnants=0;

        for (int i=0;i<inputString.length();i++)
        {
            char ch=inputString.charAt(i);
            if(ch >= 'a' && ch <= 'z'){ // to Check if it's a letter
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                {
                    vowels++;
                }
                else
                {
                    consosnants++;
                }
            }
        }
        System.out.println("Vowels: "+vowels);
        System.out.println("Consonants: "+consosnants);
        scanner.close();

    }
}
