package ex_06_Increment_Decrement_OP;

public class Lab038_Interview {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + a);  // 10 + 11 =21
        System.out.println(a); // 11

        System.out.println(++a + a); //12+12=24
        System.out.println(a); //12

        System.out.println(a++ + ++a); //12 + 14 = 26
        System.out.println(a); //14

        System.out.println(++a + a++); //15 + 15 = 30
        System.out.println(a); //16


    }
}
