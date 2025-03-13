package ex_03_Operators;

public class Lab017_ArithmeticOperators {
    public static void main(String[] args) {
        // Arithmetic Operators
        //        + (Addition)
        //       - (Subtraction)
        //       * (Multiplication)
        //       / (Division)
        //       % (Modulus) | Modulus - Remainder

        int a = 20;
        int b = 3;
        float c = 3.0f;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        // Mod -> Remainder,
//        10 | 20 |  2 - Quoinet
//           | 20 |
//           -------
//             0 - Remainder
//           ----

        System.out.println(13%7);

        System.out.println("----------------------------------------");

        System.out.println(a+c);
        System.out.println(a-c);
        System.out.println(a*c);
        System.out.println(a/c);
        System.out.println(a%c);

    }
}
