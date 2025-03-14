package ex_06_Increment_Decrement_OP;

public class Lab039_Interview2 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a-- - a);  // 10 - 9 =1
        System.out.println(a); // 9

        System.out.println(--a - a); //8 - 8=0
        System.out.println(a); //8

        System.out.println(a-- - --a); //8 - 6 = 2
        System.out.println(a); //6

        System.out.println(--a - a--); //5 - 5 = 0
        System.out.println(a); //4
    }
}
