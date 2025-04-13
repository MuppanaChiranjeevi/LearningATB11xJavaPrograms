package ex_26_Wrapper;

public class Lab156_Wrapper_Classes_Utility {

    public static void main(String[] args) {
        // Integer utility methods
        System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE); // 2147483647
        System.out.println("Integer.MIN_VALUE: " + Integer.MIN_VALUE); // -2147483648
        System.out.println("Integer.SIZE: " + Integer.SIZE); // 32 (bits)
        System.out.println("Integer.compare(5, 10): " + Integer.compare(5, 10)); // -1 (5 < 10)
        System.out.println("Integer.parseInt(\"123\"): " + Integer.parseInt("123")); // 123

        // Double utility methods
        System.out.println("Double.MAX_VALUE: " + Double.MAX_VALUE); // 1.7976931348623157E308
        System.out.println("Double.MIN_VALUE: " + Double.MIN_VALUE); // 4.9E-324
        System.out.println("Double.SIZE: " + Double.SIZE); // 64 (bits)
        System.out.println("Double.compare(10.5, 20.5): " + Double.compare(10.5, 20.5)); // -1 (10.5 < 20.5)
        System.out.println("Double.parseDouble(\"45.67\"): " + Double.parseDouble("45.67")); // 45.67

        // Boolean utility methods
        System.out.println("Boolean.parseBoolean(\"true\"): " + Boolean.parseBoolean("true")); // true
        System.out.println("Boolean.parseBoolean(\"false\"): " + Boolean.parseBoolean("false")); // false
        System.out.println("Boolean.TRUE: " + Boolean.TRUE); // true
        System.out.println("Boolean.FALSE: " + Boolean.FALSE); // false

        // Character utility methods
        System.out.println("Character.isLetter('A'): " + Character.isLetter('A')); // true
        System.out.println("Character.isDigit('5'): " + Character.isDigit('5')); // true
        System.out.println("Character.isWhitespace(' '): " + Character.isWhitespace(' ')); // true
        System.out.println("Character.toUpperCase('a'): " + Character.toUpperCase('a')); // A

        // Long utility methods
        System.out.println("Long.MAX_VALUE: " + Long.MAX_VALUE); // 9223372036854775807
        System.out.println("Long.MIN_VALUE: " + Long.MIN_VALUE); // -9223372036854775808
        System.out.println("Long.SIZE: " + Long.SIZE); // 64 (bits)
        System.out.println("Long.compare(100L, 200L): " + Long.compare(100L, 200L)); // -1 (100L < 200L)
        System.out.println("Long.parseLong(\"9876543210\"): " + Long.parseLong("9876543210")); // 9876543210

        // Float utility methods
        System.out.println("Float.MAX_VALUE: " + Float.MAX_VALUE); // 3.4028235E38
        System.out.println("Float.MIN_VALUE: " + Float.MIN_VALUE); // 1.4E-45
        System.out.println("Float.SIZE: " + Float.SIZE); // 32 (bits)
        System.out.println("Float.compare(10.5f, 20.5f): " + Float.compare(10.5f, 20.5f)); // -1 (10.5f < 20.5f)
        System.out.println("Float.parseFloat(\"12.34\"): " + Float.parseFloat("12.34")); // 12.34

        // Short utility methods
        System.out.println("Short.MAX_VALUE: " + Short.MAX_VALUE); // 32767
        System.out.println("Short.MIN_VALUE: " + Short.MIN_VALUE); // -32768
        System.out.println("Short.SIZE: " + Short.SIZE); // 16 (bits)
        System.out.println("Short.compare((short)5, (short)10): " + Short.compare((short)5, (short)10)); // -1 (5 < 10)
        System.out.println("Short.parseShort(\"1234\"): " + Short.parseShort("1234")); // 1234

        // Byte utility methods
        System.out.println("Byte.MAX_VALUE: " + Byte.MAX_VALUE); // 127
        System.out.println("Byte.MIN_VALUE: " + Byte.MIN_VALUE); // -128
        System.out.println("Byte.SIZE: " + Byte.SIZE); // 8 (bits)
        System.out.println("Byte.compare((byte)5, (byte)10): " + Byte.compare((byte)5, (byte)10)); // -1 (5 < 10)
        System.out.println("Byte.parseByte(\"127\"): " + Byte.parseByte("127")); // 127

    }
}
