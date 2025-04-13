package ex_27_Exception;


import java.io.*;

public class Lab165_Throw_Throws {
    //function to check if person is eligible to vote or not
    public static void method() throws IOException {

        throw new IOException(); // checked exception

    }
    //main method
    public static void main(String args[]) throws IOException {
        method();
        System.out.println("rest of the code...");
    }
}
