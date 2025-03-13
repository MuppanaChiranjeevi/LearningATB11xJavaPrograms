package ex_03_Operators;

public class Lab022_AND_OR_NOT {
    public static void main(String[] args) {
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println("---------------------------------");

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println("---------------------------------");

        System.out.println(!true);
        System.out.println(!false);
    }
}
