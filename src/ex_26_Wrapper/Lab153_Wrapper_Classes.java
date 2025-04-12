package ex_26_Wrapper;

public class Lab153_Wrapper_Classes {
    public static void main(String[] args) {

        // Using autoboxing (automatic conversion)
        Integer intObj3 = 20;      // Autoboxing int to Integer
        Double doubleObj3 = 20.5;  // Autoboxing double to Double
        Byte byteObj3 = 10;        // Autoboxing byte to Byte
        Short shortObj3 = 100;     // Autoboxing short to Short
        Long longObj3 = 1000L;     // Autoboxing long to Long
        Float floatObj3 = 15.5f;   // Autoboxing float to Float
        Character charObj3 = 'B';  // Autoboxing char to Character
        Boolean boolObj3 = true;   // Autoboxing boolean to Boolean

        // using intValue() and other methods
        int intVal2 = intObj3.intValue();      // Unboxing Integer to int
        byte byteVal2 = byteObj3.byteValue();  // Unboxing Byte to byte
        short shortVal2 = shortObj3.shortValue(); // Unboxing Short to short
        long longVal2 = longObj3.longValue();  // Unboxing Long to long
        float floatVal2 = floatObj3.floatValue(); // Unboxing Float to float
        double doubleVal2 = doubleObj3.doubleValue(); // Unboxing Double to double
        char charVal2 = charObj3.charValue();   // Unboxing Character to char
        boolean boolVal2 = boolObj3.booleanValue(); // Unboxing Boolean to boolean


        // Using Unboxing (implicit)
        int intVal3 = intObj3;      // Unboxing from Integer to int
        double doubleVal3 = doubleObj3; // Unboxing from Double to double
        byte byteVal3 = byteObj3;  // Unboxing from Byte to byte
        short shortVal3 = shortObj3; // Unboxing from Short to short
        long longVal3 = longObj3;  // Unboxing from Long to long
        float floatVal3 = floatObj3; // Unboxing from Float to float
        char charVal3 = charObj3;  // Unboxing from Character to char
        boolean boolVal3 = boolObj3; // Unboxing from Boolean to boolean

        // Printing all unboxed primitive values
        System.out.println("Unboxing using intValue() and other methods:");

        System.out.println("Byte: " + byteVal2);
        System.out.println("Short: " + shortVal2);
        System.out.println("Integer: " + intVal2);
        System.out.println("Long: " + longVal2);
        System.out.println("Float: " + floatVal2);
        System.out.println("Double: " + doubleVal2);
        System.out.println("Character: " + charVal2);
        System.out.println("Boolean: " + boolVal2);

        System.out.println("\nUsing Unboxing (Automatic Conversion):");
        System.out.println("Integer: " + intVal3);
        System.out.println("Double: " + doubleVal3);
        System.out.println("Byte: " + byteVal3);
        System.out.println("Short: " + shortVal3);
        System.out.println("Long: " + longVal3);
        System.out.println("Float: " + floatVal3);
        System.out.println("Character: " + charVal3);
        System.out.println("Boolean: " + boolVal3);
    }
}
