package ex_06_Increment_Decrement_OP;

public class Lab036_Increment {

    public static void main(String[] args) {
        int c=20;
        System.out.println(c); //print c=20
        System.out.println(++c); //print c=20+1=21
        System.out.println(c++); //print c=21 then c=21+1=22
        System.out.println(c);   //print c=22

        System.out.println("-----------------------");

        int a=10;
        int b=++a; //First increments a value by one, then uses the value. -->a=10+1=11-->b=11
        System.out.println(a);//11
        System.out.println(b); //11

        System.out.println("-----------------------");

        b=a++;   //First uses the value, then increments a value by one.-->b=11-->a=11+1=12
        System.out.println(a); //12
        System.out.println(b); //11

    }

}
