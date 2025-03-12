package ex_02_Java_Basics_part2;

public class Lab008_DataTypes {
    public static void main(String[] args) {
        /*
        In Java, a data type defines the type of data a variable can store.
        It determines the size and type of values that can be assigned to a variable.
        Java is a statically-typed programming language. It means, all variables must be declared before its use.

        There are two types of data types in Java:
        1.Primitive data types
          Primitive data types are the basic building blocks in Java. They store simple values directly in memory.

        byte:

        A byte is a small integer type that takes 1 byte (8 bits) of memory.
        It can store values from -2⁷ to (2⁷ - 1) → -128 to 127
        Example: byte smallNumber = 100;

        short:

        A short is a slightly larger integer type that takes 2 bytes (16 bits) of memory.
        It can store values from -2¹⁵ to (2¹⁵ - 1) → -32,768 to 32,767.
        Example: short mediumNumber = 20000;

        int:

        An int is the most commonly used integer type in Java, taking 4 bytes (32 bits) of memory.
        It can store values from -2³¹ to (2³¹ - 1) → -2,147,483,648 to 2,147,483,647.
        Example: int number = 123456;
        long:

        A long is used when larger integer values are needed, taking 8 bytes (64 bits) of memory.
        It can store values from -2⁶³ to (2⁶³ - 1) → -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.
        A long value must be suffixed with L.
        Example: long largeNumber = 9223372036854775807L;

        float:

        A float is used for storing decimal numbers with 4 bytes (32 bits) of memory.
        It can represent values approximately between ±(2⁻¹²⁶) to ±(2¹²⁷ - 1).
        A float value must be suffixed with f.
        Precision: ~6-7 decimal digits
        Example: float decimalNumber = 3.14f;

        double:

        A double is a more precise decimal type that takes 8 bytes (64 bits) of memory.
        It can represent values approximately between ±(2⁻¹⁰²²) to ±(2¹⁰²³ - 1)
        Precision: ~15-16 decimal digits
        Example: double preciseNumber = 99.99;

        char:

        A char is used to store a single character and takes 2 bytes (16 bits) of memory.
        It can store Unicode characters, ranging from 0 to 65,535.
        Example: char letter = 'A';

        boolean:

        A boolean is used to store only two possible values: true or false.
        It takes 1 bit of memory but is often stored as 1 byte  for memory alignment.
        Example: boolean isJavaFun = true;


        2. Non-Primitive Data Types
            These include:
            String (String name = "Java";)
            Arrays (int[] arr = {1, 2, 3};)
            Classes (User-defined objects)
            Interfaces & Enums
         */
        System.out.println("Data types Explanantion");
    }
}
