package ex_06_Increment_Decrement_OP;

public class Lab037_Decrement {
    public static void main(String[] args) {
        int c=20;
        System.out.println(c); //print c=20
        System.out.println(--c); //print c=20-1=19
        System.out.println(c--); //print c=19 then c=19-1=18
        System.out.println(c);   //print c=18

        System.out.println("-----------------------");

        int a=10;
        int b=--a; //First increments a value by one, then uses the value. -->a=10-1=9-->b=9
        System.out.println(a);//9
        System.out.println(b); //9

        System.out.println("-----------------------");

        b=a--;   //First uses the value, then increments a value by one.-->b=9-->a=9-1=8
        System.out.println(a); //8
        System.out.println(b); //9

    }
}
