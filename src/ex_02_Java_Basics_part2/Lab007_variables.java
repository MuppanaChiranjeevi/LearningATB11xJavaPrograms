package ex_02_Java_Basics_part2;

public class Lab007_variables {
    public static void main(String[] args) {
        /*
        In Java, a variable is a container that holds/stores the value.
        Variable is a name of the memory location.
        Each variable has a specific data type that determines what kind of data it can store.
        ( For example: - int, string, float, char, etc.)
        Each variable must have a unique name (**identifier).
        Memory will be allocated to the variable while executing the program.
        It is a combination of "vary + able" which means its value can be changed.
        Value of the variable can be changed any number of times during the program execution.


        Types of Variables
        There are three types of variables in Java:
        1.local variable -- within {}
        2.instance variable
        3.static variable

       General Syntax for Declaring a Variable:-
       <data_type> <variable_name>;

       Syntax for Declaring and Intialisation a Variable:-
       <data_type> <variable_name> = <value>;

        Data Type – what kind of data that it can store. For example, int, string, float, char, etc.
        Variable Name – Identifier.
        =    - assignment operator
        Value – The data assigned to the variable.

         */
        int i;
        i=100;
        System.out.println(i);

        byte b = 10;
        // byte -> data type - type of container
        // b ->  varibale name -> identifier
        // = -> assignment - assign the value to the b
        // 10 -> literal -> integer value
        System.out.println(b);
        b=20;
        System.out.println(b);
    }
}
