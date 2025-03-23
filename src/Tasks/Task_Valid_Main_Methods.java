package Tasks;

public class Task_Valid_Main_Methods {
    /**
     * In Java, the main method is a special method that serves as the entry point for any standalone Java application.
     * public: This is an access modifier that represents accessibility.
     *         It means main method is  accessible from everywhere
     * static: This means the method belongs to the class itself rather than an instance of the class.
     * void: This is the return type of the method. It specifies that the main method does not return any value.
     * main: This is the name of the method.
     *      main is a specific name recognized by the JVM as the entry point of the program.
     * String[] args: This is an array of String that stores command-line arguments passed to the program.
     *
     * VValid Java main() method signature:
     *
     * public static void main(String[] args)
     * -->This is the most commonly used and standard main method signature.
     *
     * public static void main(String []args)
     * public static void main(String args[])
     * public static void main(String [] args)
     * public static void main(String[]args)
     *--> Java allows [] after the type (String[]) or after the variable name (args[]).
     *--> The placement of [] with respect to String or args does not matter.
     *--> Extra spaces between brackets and variable names do not affect functionality.
     *
     * static public void main(String[] args)
     * -->The order of public and static does not matter
     *
     * public static void main(String[] myArgs)
     * -->args is just a variable name; you can replace it with any valid identifier.
     *
     * public static void main(String... args)
     *--> Using Varargs (String... args) Instead of an Array
     *
     * public static final void main(String[] args)
     * public final static void main(String[] args)
     *
     * final public static void main(String[] args)
     *  final static public void main(String[] args)
     *
     *  static public final void main(String[] args)
     *  static  final public void main(String[] args)
     *  --> The order of  final, static, public does not matter in Java.
     *
     */
    public static void main(String[]args) {
        System.out.println("hi");
    }

}
