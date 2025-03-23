package Tasks;

public class Task_Valid_Main_Methods {
    /**
     * public static void main(String[] args)
     * -->This is the most commonly used and standard main method signature.
     *
     * public static void main(String []args)
     * public static void main(String args[])
     *-->Java allows [] after the type (String[]) or after the variable name (args[]).
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
     final  static public  void main(String... Chiranjeevi) {

         System.out.println("Hello, World!");
     }

}
