package ex_02_Java_Basics_part2;

public class Lab013_Multiple_Variables2 {
    public static void main(String[] args) {
        int i,j=10;
        /*
        It initializes only j to 10
        i remains uninitialized
        (if you try to use it before assigning a value, it will cause a compilation error )
         */
//        System.out.println(i);
        System.out.println(j);

        System.out.println("-------------------------");
        // Assign Different Values in a Single Statement (Multiple Initializations)
        int x =10, y = 20, z = 30;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println("-------------------------");
        // Assign the same value to multiple variables in a single statement:
        int d = 5, e = 5, f = 5;
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println("-------------------------");
        //  Declare Multiple Variables Without Initializing
        int a, b, c;
        // Initialise mulitiple variables with same value
        a=b=c=100;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println("-------------------------");

//      boolean flag1 = flag2 = flag3 = true;
    /*
    In Java, you cannot declare variables and assign values to them in a chained way in a single statement
    Java does not support chaining assignments in this way when the variables are being declared and initialized in the same statement
     */
        boolean flag1, flag2, flag3;
        flag1 = flag2 = flag3 = true;
        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);
    }
}
