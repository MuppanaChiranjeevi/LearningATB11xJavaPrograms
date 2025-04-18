package ex_29_Generics;

public class Lab209_Code_Reuse {
    public static void main(String[] args) {
        Printer<Integer> intPrinter = new Printer<>();
        intPrinter.print(100);

        Printer<String> stringPrinter = new Printer<>();
        stringPrinter.print("Hello Generics");

        Printer<Double> doublePrinter = new Printer<>();
        doublePrinter.print(99.99);

        Printer<Character> charPrinter = new Printer<>();
        charPrinter.print('Z');
    }
}


class Printer<T> {
    public void print(T value) {
        System.out.println(value);
    }
}