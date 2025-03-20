package ex_04_Type_Casting;

public class Lab028_ImplicitCasting {
    public static void main(String[] args) {
        byte byteValue = 10;

        // byte to short
        short shortValue = byteValue;
        System.out.println("byte to short: " + shortValue);

        // byte to int
        int intValue = byteValue;
        System.out.println("byte to int: " + intValue);

        // byte to long
        long longValue = byteValue;
        System.out.println("byte to long: " + longValue);

        // byte to float
        float floatValue = byteValue;
        System.out.println("byte to float: " + floatValue);

        // byte to double
        double doubleValue = byteValue;
        System.out.println("byte to double: " + doubleValue);

        System.out.println("----------------------------------------");

        shortValue = 100;

        // short to int
        intValue = shortValue;
        System.out.println("short to int: " + intValue);

        // short to long
        longValue = shortValue;
        System.out.println("short to long: " + longValue);

        // short to float
        floatValue = shortValue;
        System.out.println("short to float: " + floatValue);

        // short to double
        doubleValue = shortValue;
        System.out.println("short to double: " + doubleValue);

        System.out.println("----------------------------------------");

        intValue = 1000;

        // int to long
        longValue = intValue;
        System.out.println("int to long: " + longValue);

        // int to float
        floatValue = intValue;
        System.out.println("int to float: " + floatValue);

        // int to double
        doubleValue = intValue;
        System.out.println("int to double: " + doubleValue);

        System.out.println("----------------------------------------");

        longValue = 10000L;

        // long to float
        floatValue = longValue;
        System.out.println("long to float: " + floatValue);

        // long to double
        doubleValue = longValue;
        System.out.println("long to double: " + doubleValue);

        System.out.println("----------------------------------------");

        floatValue = 10.5678f;

        // float to double
        doubleValue = floatValue;
        System.out.println("float to double: " + doubleValue);

        System.out.println("----------------------------------------");
        char charValue = 'A';

        // char to int (ASCII value)
        intValue = charValue;
        System.out.println("char to int: " + intValue);
        System.out.println(65=='A');
        System.out.println(66=='B');
    }
}
