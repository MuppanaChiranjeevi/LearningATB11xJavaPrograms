package ex_04_Type_Casting;

public class Lab029_ExplicitCasting {

    public static void main(String[] args) {
        double doubleValue = 35000.987654321;
        System.out.println("double Value: "+doubleValue);
        // double to float
        float floatValue = (float) doubleValue;
        System.out.println("double to float: " + floatValue); // Possible loss of precision

        // double to long
        long longValue = (long) doubleValue;
        System.out.println("double to long: " + longValue); // Fractional part truncated

        // double to int
        int intValue = (int) doubleValue;
        System.out.println("double to int: " + intValue); // Fractional part truncated

        // double to short
        short shortValue = (short) doubleValue;
        System.out.println("double to short: " + shortValue); // Data loss, fractional part truncated

        // double to byte
        byte byteValue = (byte) doubleValue;
        System.out.println("double to byte: " + byteValue); // Data loss, fractional part truncated

        System.out.println("----------------------------------------");

        floatValue = 40000.99f;
        System.out.println("float Value: "+floatValue);
        // float to long
        longValue = (long) floatValue;
        System.out.println("float to long: " + longValue); // Fractional part truncated

        // float to int
        intValue = (int) floatValue;
        System.out.println("float to int: " + intValue); // Fractional part truncated

        // float to short
        shortValue = (short) floatValue;
        System.out.println("float to short: " + shortValue); // Data loss, fractional part truncated

        // float to byte
        byteValue = (byte) floatValue;
        System.out.println("float to byte: " + byteValue); // Data loss, fractional part truncated

        System.out.println("----------------------------------------");

        longValue = 830966231L;
        System.out.println("long Value: "+longValue);
        // long to int
       intValue = (int) longValue;
        System.out.println("long to int: " + intValue); // Possible overflow and data loss

        // long to short
        shortValue = (short) longValue;
        System.out.println("long to short: " + shortValue); // Possible overflow and data loss

        // long to byte
        byteValue = (byte) longValue;
        System.out.println("long to byte: " + byteValue);

        System.out.println("----------------------------------------");
        intValue = 1234567890;
        System.out.println("int Value: "+intValue);
        // int to short
        shortValue = (short) intValue;
        System.out.println("int to short: " + shortValue); // Data loss if the value is out of range for short

        // int to byte
        byteValue = (byte) intValue;
        System.out.println("int to byte: " + byteValue); // Data loss if the value is out of range for byte

        System.out.println("----------------------------------------");

        shortValue = 150;
        System.out.println("short Value: "+shortValue);
        // short to byte
        byteValue = (byte) shortValue;
        System.out.println("short to byte: " + byteValue);
    }


}

