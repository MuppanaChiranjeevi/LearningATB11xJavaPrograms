package Tasks;

public class Task_IN_DE_OP_01 {
    public static void main(String[] args) {
        int a=10;
        System.out.println(++a + a++ + a++); // 11 + 11 + 12 = 34
        System.out.println(a); // 13
    }
}
