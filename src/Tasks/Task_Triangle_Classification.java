package Tasks;

import java.util.Scanner;

public class Task_Triangle_Classification
{
    /**Question:-
     * Write a program that classifies a triangle based on its side lengths.
     * Given three input values representing the lengths of the sides,
     * determine if the triangle is equilateral (all sides are equal),
     * isosceles (exactly two sides are equal), or scalene (no sides are equal).
     * Use an if-else statement to classify the triangle.
     *
     */
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the first side length: ");
        int firstSide= scanner.nextInt();
        System.out.print("Enter the second side length: ");
        int secondSide= scanner.nextInt();
        System.out.print("Enter the third side length: ");
        int thirdSide= scanner.nextInt();
        scanner.close();
        if(firstSide>0 && secondSide>0 && thirdSide>0)
        {
            if (firstSide + secondSide > thirdSide &&
                    secondSide + thirdSide > firstSide &&
                    thirdSide + firstSide > secondSide)
                // This ensures that the inputs actually form a valid triangle.
            {
                if (firstSide == secondSide && secondSide == thirdSide)
                {
                    System.out.println("Equilateral Triangle");
                }
                else if (firstSide == secondSide || secondSide == thirdSide || thirdSide == firstSide)
                {
                    System.out.println("Isosceles  Triangle");
                }
                else
                {
                    System.out.println("Scalene Triangle");
                }
            }
            else
            {
                System.out.println("The given sides do not form a valid triangle.");
            }
        }
        else
        {
            System.out.println("Invalid input! All sides must be positive numbers greater than zero");
        }
    }
}
