package ex_02_Java_Basics_part2;

public class Lab0010_printF {
    public static void main(String[] args) {
        int a = 10;
        System.out.printf("You variable is %d",a);
        // %d -> int, byte, long, short, - data type
        // %s -> String
        // %f -> float, double,
        // %b ->boolean
        int b = 20;
        float f=1.23456789f;
        System.out.println();
        System.out.printf("%d + %d",a,b);
        System.out.println();
        System.out.printf("%d + %f",a,f);
        System.out.println();
        System.out.printf("%d + %b",a,1);
    }
}
