package ex_27_Exception;

import java.io.*;


public class Lab157_Exception_Handling {
    /**
     *
     * In Java, an exception is an event that occurs during the execution of a program that disrupts the normal flow of the program.
     * It is an object representing an error or an unexpected condition that occurs during runtime.
     * Exception handling in Java is a mechanism to handle runtime errors, ensuring that the normal flow of the program is maintained.
     * The java.lang.Throwable class is the root class of Java Exception hierarchy inherited by two subclasses: Exception and Error.
     *
     * In Java, exceptions are classified into two main types:
     * 1. Checked Exceptions (Compile-Time Exceptions)
     *      Exceptions that are checked at compile-time.
     *      The Java compiler forces you to either handle them using a try-catch block or declare them using the throws keyword in the method signature.
     *      Examples:
                 * IOException (File handling, network issues)
                 * SQLException (Database errors)
                 * ClassNotFoundException (Class not found at runtime)
     *
     * 2. Unchecked Exceptions (Runtime Exceptions)
     *      Exceptions that are not checked at compile-time but at runtime.
     *      The compiler does not enforce you to handle them.
     *      These exceptions are subclasses of RuntimeException.
     *      These exceptions occur due to programming errors, such as logic errors or incorrect assumptions in the code.
     *      Examples:
                 * NullPointerException (Accessing a null object)
                 * ArrayIndexOutOfBoundsException (Invalid array index)
                 * ArithmeticException (Division by zero)
                 * IllegalArgumentException (Invalid method argument)
                 * NumberFormatException (Invalid string-to-number conversion)
     * 3. Errors (Not Exceptions)
     *      Errors are more severe than exceptions and usually not meant to be caught.
     *      These problems are outside the control of your program, such as resource exhaustion or JVM internal issues.
     *      Examples:
                 * OutOfMemoryError (JVM runs out of memory)
                 * StackOverflowError (Infinite recursion)
     * The try-catch block in Java is one of the primary mechanisms for exception handling.
     * try block contains the code that might throw an exception.
     * catch block is to handle the exception if it occurs.
     * Best practice: In a catch block, specific exceptions are preferred rather than general exceptions.
     * All catch blocks must be ordered from most specific to most general.
     * If a catch block handles the exception, then the execution continues from the code placed after the try-catch block.
     * The finally block is an optional part of a try-catch statement that always gets executed,
     * regardless of whether an exception was thrown or not.
     * The finally block is used to execute cleanup code (e.g., closing files, releasing resources).
     * Syntax:
     * try {
     *     // Code that might throw an exception
     * } catch (ExceptionType e) {
     *     // Code to handle the exception
     * } finally {
     *     // Code that will always execute
     *     // cleanup code
     * }
     * We can handle multiple type of exceptions in Java by using multiple catch blocks, each catching a different type of exception.
     * try {
     *     // Code that may throw an exception
     * } catch (ArithmeticException e) {
     *     // Code to handle the exception
     * } catch(ArrayIndexOutOfBoundsException e){
     *     //Code to handle the another exception
     * }catch(NumberFormatException e){
     *      //Code to handle the another exception
     * }catch(Exception e){
            //Code to handle the general exception
     * }
     */
    public static void main(String[] args) {

        try {
            readFile("test.txt");
        } catch (IOException e) {
            System.out.println("Caught an IOException: " + e.getMessage());
        }
    }

    // This method declares that it might throw an IOException
    public static void readFile(String fileName) throws IOException {
        FileReader file = new FileReader(fileName);  // May throw FileNotFoundException (which is a subclass of IOException)
        BufferedReader fileInput = new BufferedReader(file);

        // Reading the first line
        System.out.println(fileInput.readLine());
        fileInput.close();
    }
}
