package ex_05_TernaryOperator;

public class Lab033_TernaryOperator_Nested {
    public static void main(String[] args) {
        int num1=200, num2=500,num3=1000;
        int res=(num1>num2)?(num1>num3?num1:num3):(num2>num3?num2:num3);
//        Nested Ternary: -
//        result = condition1 ? expression1 : expression2;
//        expression1 - (condition2 ? expression1 : expression2)
//        expression2 - (condition3 ? expression1 : expression2)
        System.out.println("Maximum number is: "+res);

        res=(num1<num2)?(num1<num3?num1:num3):(num2<num3?num2:num3);
        System.out.println("Minimum number is: "+res);

        int score = 65;
        // Nested ternary to assign grade
        String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";

        System.out.println("The grade is: " + grade);
    }
}
