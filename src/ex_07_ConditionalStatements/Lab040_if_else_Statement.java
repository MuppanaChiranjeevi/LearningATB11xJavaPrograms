package ex_07_ConditionalStatements;

public class Lab040_if_else_Statement {
    public static void main(String[] args) {
        int age =Integer.parseInt(args[0]);
        if (age>=18){
            System.out.println("Eligible for Vote");
        }
        else{
            System.out.println("Not Eligible for Vote");
        }

    }
}
