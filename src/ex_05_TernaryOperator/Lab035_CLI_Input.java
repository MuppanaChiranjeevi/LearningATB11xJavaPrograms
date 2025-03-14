package ex_05_TernaryOperator;

public class Lab035_CLI_Input {
    public static void main(String[] args) {
        String s1=args[0];
        String s2=args[1];
        String s3=args[2];
//      String s4=args[3]; //ArrayIndexOutOfBoundsException

        int age=Integer.parseInt(s2);
        age += 1;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


    }
}
