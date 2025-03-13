package ex_03_Operators;

public class Lab023_Bodmas {
    public static void main(String[] args) {
        //Java program that evaluates mathematical expressions following the BODMAS
        // (Bracket, Order, Division/Multiplication, Addition/Subtraction) rule.
        double res=(9 * 3 / 9 + 1) * 3;
        System.out.println("Result1:"+res);

        res=10 + 5 - 3 * 2 ^ 4 % 5 / 6;
        System.out.println("Result2:"+res);

        res=(8 + 2 * 5) / (1 + 3 * 2 - 4);
        System.out.println("Result3:"+res);

        res=(6 / 2 * 3 ) + (8 - 3 + 7) * 4;
        System.out.println("Result4:"+res);


    }
}
