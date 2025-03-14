package ex_05_TernaryOperator;

public class Lab034_CliInput {
    public static void main(String[] args) {
        String age=args[0];
        System.out.println(age);
        System.out.println(age instanceof String);

        int a=Integer.parseInt(age);

        String res=a<18?"Minor":a<60?"Adult":"Senior";
        System.out.println(res);
    }
}
