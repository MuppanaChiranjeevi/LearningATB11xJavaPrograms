package ex_05_TernaryOperator;

public class Lab032_TernaryOperator02 {
    public static void main(String[] args) {
        int num = 21;

        // Using ternary operator to check even or odd
        String result = num % 2 == 0 ? "Even" : "Odd";
        System.out.println("The number is: " + result);

        System.out.println("-------------------");

        int number = 5;
        // check number is +ve or -ve
        result = number > 0 ? "Positive" : "Negative";
        System.out.println(result);

        System.out.println("-------------------");

        int age = 18;
        // Check if a person is an adult
        String adultStatus = (age >= 18) ? "Adult" : "Minor";

        System.out.println(adultStatus);

        System.out.println("-------------------");

        int x = 10;
        int y = 20;
        System.out.println(Math.max(x,y));

        int max = x > y ? x : y;
        System.out.println(max);
    }
}
