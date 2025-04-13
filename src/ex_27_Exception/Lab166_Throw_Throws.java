package ex_27_Exception;

import java.io.FileReader;
import java.io.IOException;

public class Lab166_Throw_Throws {
    public static void main(String[] args) {
        try {
            callToReadFile();  // Caller must handle or declare the exception
        } catch (IOException e) {
            System.out.println(e);
            System.out.println(e.getMessage());
        }
    }
    static void callToReadFile() throws IOException {
        readFile(); // Caller must handle or declare the exception
    }


    static void readFile() throws IOException {
        FileReader fr = new FileReader("nonexistentfile.txt"); // checked exception
        fr.read();
        fr.close();
    }
}
