package ex_01_Java_Basics_part1;

public class Lab004_Identifiers {
    /*
    In Java, an identifier is the name given to identify variables, methods, classes, packages, and
    other elements in a program.
    Identifiers must follow certain rules and conventions.
    Rules for Java Identifiers
    -->Identifier can contain letters (A-Z or a-z), Digits(0-9), and two special symbol i.e. Dollar ($), _,.
    -->Must begin with a letter (A-Z or a-z), a dollar sign ($), or an underscore (_).
    -->Should not start with a number
    -->Cannot be a Java reserved keyword.
    -->Case-sensitive
    -->No length limit (but should be meaningful and readable)

     Java Identifier Naming Conventions (Best Practices)
        Class & Interfaces names → PascalCase (e.g., StudentDetails)
        Variable & method names → camelCase (e.g., firstName, calculateSum())
        Constants → UPPER_CASE_WITH_UNDERSCORES (e.g., MAX_VALUE)
        Package names → lowercase with dots (e.g., com.example.utils)
     */
    public static void main(String[] args) {
        System.out.println(" Valid Identifiers:\n" +
                "myVariable (Starts with a letter, follows the rules)\n" +
                "_tempValue (Starts with an underscore, allowed in Java)\n" +
                "$amount (Starts with a dollar sign, allowed but not recommended)\n" +
                "student123 (Letters and digits are allowed after the first character)\n" +
                "total_Sum (Underscore is allowed between characters)\n" +
                "MAX_VALUE (Valid constant name in uppercase, follows Java naming conventions)\n" +
                "count9x (Letters, digits, and no special characters—valid)\n" +
                "PI_value (Mix of uppercase and lowercase with underscore—valid)\n" +
                "JavaIdentifierExample (Camel case—valid for class names)\n" +
                "sumOfNumbers (Camel case—valid for variable names)");
        System.out.println("\n");
        System.out.println("Invalid Identifiers:\n"+"" +
                "2ndNumber\tCannot start with a digit (2)\n" +
                "class\tReserved keyword in Java\n" +
                "void\tReserved keyword in Java\n" +
                "my-variable\tHyphens (-) are not allowed, use _ instead\n" +
                "sum@value\tSpecial characters (@) are not allowed\n" +
                "int\tReserved keyword in Java\n" +
                "import\tReserved keyword in Java\n" +
                "switch\tReserved keyword in Java\n" +
                "#data\tSpecial characters (#) are not allowed\n" +
                "my value\tSpaces are not allowed in identifiers");
    }
}
