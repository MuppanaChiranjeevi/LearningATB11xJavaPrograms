package ex_26_Wrapper;

public class Lab155_Wrapper_Classes {

    public static void main(String[] args) {
        // Primitive values
        int num = 100;
        double d = 45.67;
        boolean b = true;
        char c = 'A';
        long l = 9876543210L;
        float f = 12.34f;
        short s = 1234;
        byte by = 127;

        // Converting primitives to Strings using wrapper classes and String.valueOf()

        // int to String
        String numStr1 = Integer.toString(num);    // Using wrapper class
        String numStr2 = String.valueOf(num);      // Using String class
        System.out.println("int to String (Wrapper Class): " + numStr1);
        System.out.println("int to String (String.valueOf): " + numStr2);

        // double to String
        String doubleStr1 = Double.toString(d);    // Using wrapper class
        String doubleStr2 = String.valueOf(d);     // Using String class
        System.out.println("double to String (Wrapper Class): " + doubleStr1);
        System.out.println("double to String (String.valueOf): " + doubleStr2);

        // boolean to String
        String boolStr1 = Boolean.toString(b);     // Using wrapper class
        String boolStr2 = String.valueOf(b);       // Using String class
        System.out.println("boolean to String (Wrapper Class): " + boolStr1);
        System.out.println("boolean to String (String.valueOf): " + boolStr2);

        // char to String
        String charStr1 = Character.toString(c);   // Using wrapper class
        String charStr2 = String.valueOf(c);       // Using String class
        System.out.println("char to String (Wrapper Class): " + charStr1);
        System.out.println("char to String (String.valueOf): " + charStr2);

        // long to String
        String longStr1 = Long.toString(l);        // Using wrapper class
        String longStr2 = String.valueOf(l);       // Using String class
        System.out.println("long to String (Wrapper Class): " + longStr1);
        System.out.println("long to String (String.valueOf): " + longStr2);

        // float to String
        String floatStr1 = Float.toString(f);      // Using wrapper class
        String floatStr2 = String.valueOf(f);      // Using String class
        System.out.println("float to String (Wrapper Class): " + floatStr1);
        System.out.println("float to String (String.valueOf): " + floatStr2);

        // short to String
        String shortStr1 = Short.toString(s);      // Using wrapper class
        String shortStr2 = String.valueOf(s);      // Using String class
        System.out.println("short to String (Wrapper Class): " + shortStr1);
        System.out.println("short to String (String.valueOf): " + shortStr2);

        // byte to String
        String byteStr1 = Byte.toString(by);       // Using wrapper class
        String byteStr2 = String.valueOf(by);      // Using String class
        System.out.println("byte to String (Wrapper Class): " + byteStr1);
        System.out.println("byte to String (String.valueOf): " + byteStr2);
    }
}
