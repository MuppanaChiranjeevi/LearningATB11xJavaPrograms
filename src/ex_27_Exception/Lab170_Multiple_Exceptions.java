package ex_27_Exception;

public class Lab170_Multiple_Exceptions {


    // Method that declares multiple runtime exceptions using 'throws'
    public static void throwMultipleExceptions(String input, int[] array, int index)
            throws ArithmeticException, NullPointerException,
            IllegalArgumentException, ArrayIndexOutOfBoundsException,
            NumberFormatException {

        // NullPointerException
        if (input == null) {
            throw new NullPointerException("Input string is null");
        }

        // NumberFormatException
        int number = Integer.parseInt(input);  // may throw if input is not a valid number

        // ArithmeticException
        if (number == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        int result = 100 / number;

        // ArrayIndexOutOfBoundsException
        if (index < 0 || index >= array.length) {
            throw new ArrayIndexOutOfBoundsException("Invalid index: " + index);
        }
        int value = array[index];

        // IllegalArgumentException
        if (number < 0) {
            throw new IllegalArgumentException("Negative numbers not allowed");
        }

        // If all checks pass
        System.out.println("Number: " + number);
        System.out.println("Result of division: " + result);
        System.out.println("Array value: " + value);
    }

    public static void main(String[] args) {
        try {
            String input = "-5";  // Try null, "abc", "-5", "5"
            int[] array = {10, 20, 30};
            int index = -1;       // Try -1, 5, etc.

            throwMultipleExceptions(input, array, index);

        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
