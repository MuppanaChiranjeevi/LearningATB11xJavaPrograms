package ex_27_Exception;
import java.io.*;
public class Lab164_Throw_Throws {
    /**
     * throw Keyword
     * Used to explicitly throw an exception from a method or any block of code.
     * Can only throw one exception at a time.
     * We can throw either checked or unchecked exception.
     * Syntax:
     * throw Instance
     * throw new exception_class("error message");
     * throws Keyword
     * The throws keyword is used in a method signature to declare that the method might throw one or more exceptions.
     * It's mainly used for checked exceptions to indicate that the method doesn't handle the exception itself but passes it to the caller.
     * The caller to these methods has to handle the exception using a try-catch block.
     * Syntax:
     * returnType methodName() throws ExceptionType1, ExceptionType2 { ... }
     * Note:
     * If we throw an unchecked exception from a method, it is not required to handle the exception or declare it in throws clause.
     * However, for checked exceptions, handling or declaration in the throws clause is mandatory."
     * Note:
     * Every subclass of Error and RuntimeException is an unchecked exception in Java. A checked exception is everything else under the Throwable class.
     */

    public static void validate(int age) {
        if(age<18) {
            //throw Arithmetic exception if not eligible to vote
            throw new ArithmeticException("Person is not eligible to vote"); //unchecked exception
        }
        else {
            System.out.println("Person is eligible to vote!!");
        }
    }
    //main method
    public static void main(String args[]){
        //calling the function
        validate(13);
        System.out.println("rest of the code...");
    }
}
