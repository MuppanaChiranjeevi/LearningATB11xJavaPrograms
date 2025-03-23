package ex_10_Methods;

public class Lab061_Methods {

    // Method returning an integer
    public static int getInteger() {
        return 42;
    }

    // Method returning a double
    public static double getDouble() {
        return 3.14159;
    }

    // Method returning a long
    public static long getLong() {
        return 8309662316l;
    }

    // Method returning a String
    public static String getString() {
        return "Hello, Chiranjeevi";
    }

    // Method returning a boolean
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method returning a char
    public static char getFirstChar(String input) {
        if (input != null && input.length() > 0) {
            return input.charAt(0);
        }
        return ' ';
    }

    // Method with no return type (void method)
    public static void printMessage() {
        System.out.println("This is a method with no return value (void).");
    }

    public static void main(String[] args) {
        // Calling each static method
        int integerValue = getInteger();
        double doubleValue = getDouble();
        String stringValue = getString();
        boolean isEvenResult = isEven(4);
        char firstChar = getFirstChar("Chiru");
        long longValue=getLong();


        // Printing the results
        System.out.println("Integer Value: " + integerValue);
        System.out.println("Double Value: " + doubleValue);
        System.out.println("String Value: " + stringValue);
        System.out.println("Long Value: " + longValue);
        System.out.println("Is Even (4): " + isEvenResult);
        System.out.println("First Char of 'Java': " + firstChar);

        // Calling void method
        printMessage();
    }
}

