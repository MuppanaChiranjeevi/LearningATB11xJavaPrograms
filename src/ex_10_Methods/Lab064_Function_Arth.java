package ex_10_Methods;
import java.util.Scanner;
public class Lab064_Function_Arth {

    public static void main(String[] args) {
        int num1=0,num2=0;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        if(scanner.hasNextInt()){
            num1=scanner.nextInt();
        }
        else{
            System.out.println("Enter the integer only");
            System.exit(0);
        }

        System.out.print("Enter the second number: ");
        if(scanner.hasNextInt()){
            num2=scanner.nextInt();
        }
        else{
            System.out.println("Enter the integer only");
            System.exit(0);
        }
        System.out.println("Addition: "+add(num1,num2));
        System.out.println("Subtraction: "+sub(num1,num2));
        System.out.println("Multiplication: "+mul(num1,num2));
        System.out.println("Divison: "+div(num1,num2));
        System.out.println("Modulus: "+mod(num1,num2));

    }
    public static int add(int a,int b){
        return a+b;
    }
    static int sub(int a,int b){
        return a-b;
    }
    static int mul(int a,int b){
        return a*b;
    }
    static int div(int a,int b){
        if (b == 0){
            System.out.println("Div by zero is not allowed");
            System.exit(0);
        }
            return a/b;
    }
    static int mod(int a, int b){
        return a%b;
    }


}
