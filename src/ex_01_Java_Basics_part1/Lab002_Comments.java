package ex_01_Java_Basics_part1;

public class Lab002_Comments {
    public static void main(String[] args) {
        /**
         * Java comments are statements in a program that are not executed by the compiler and interpreter.
         * Comments are lines which are skipped during execution of a program
         *
         *
         *  There are three types of comments in Java
         *         Single Line Comment
         *         Multi Line Comment
         *         Documentation Comment
         */

        //This is single line comment

        /*
        This
        is
        a
        multi
        line
        comment

        The multi-line comment is used to
        comment multiple lines of code.
         */

      //Note: Usually // is used for short comments and /* */ is used for longer comments.
        /**
         * This is a documentation comment
         * Documentation comments are a special kind of multi-line comment that is used to generate
         * external documentation for your code (like API documentation).
         * Author : Chiranjeevi
         * Course :  ATB11x
         */
        System.out.println("Java Comments");
    }
}
