package ex_27_Exception;

public class Lab160_Exception_Handling {

    public static void main(String[] args) {
        handleNullPointerException();
        handleArrayIndexOutOfBoundsException();
        handleArithmeticException();
        handleNumberFormatException();
        handleIllegalArgumentException();
        handleClassCastException();
        handleNegativeArraySizeException();
    }

    static void handleNullPointerException() {
        try {
            String str = null;
            System.out.println(str.length());  // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    static void handleArrayIndexOutOfBoundsException() {
        try {
            int[] arr = new int[3];
            System.out.println(arr[5]);  // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    static void handleArithmeticException() {
        try {
            int result = 10 / 0;  // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
    }

    static void handleNumberFormatException() {
        try {
            int num = Integer.parseInt("abc");  // NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }
    }

    static void handleIllegalArgumentException() {
        try {
            Thread.sleep(-1000);  // IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (InterruptedException e) {
            // This is a checked exception, not the focus here
        }
    }

    static void handleClassCastException() {
        try {
            Object obj = 10;
            String str = (String) obj;  // ClassCastException
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException: " + e.getMessage());
        }
    }

    static void handleNegativeArraySizeException() {
        try {
            int[] arr = new int[-5];
        } catch (NegativeArraySizeException e) {
            System.out.println("Caught NegativeArraySizeException: " + e.getMessage());
            System.out.println("Solution: Ensure array size is non-negative when creating arrays.");
        }
    }
}

