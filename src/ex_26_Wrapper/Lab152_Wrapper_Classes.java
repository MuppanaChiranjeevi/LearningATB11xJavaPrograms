package ex_26_Wrapper;

public class Lab152_Wrapper_Classes {
    /**
     * Wrapper classes are used to convert primitive data types into objects and vice versa.
     * The automatic conversion of primitive type into its corresponding wrapper class is known as autoboxing or boxing. (primitive to object)
     * The automatic conversion of wrapper type into its corresponding primitive type is known as unboxing.(object to primitive).
     * These classes "wrap" the primitive types into objects, enabling them to be used in contexts where objects are required (like collections, generics, etc.)
     *
     * Primitive Type	Wrapper Class
     *      byte	        Byte
     *      short	        Short
     *      int	            Integer
     *      long	        Long
     *      float	        Float
     *      double	        Double
     *      char	        Character
     *      boolean	        Boolean
     *
     * Why Use Wrapper Classes?
     * To convert primitive types into objects
     * To make use of utility methods provided by wrapper classes
     * To allow null values for primitive types
     * To support object-oriented features with primitive values
     * Java collection framework works with objects only. All classes of the collection framework
     * (ArrayList, LinkedList, Vector, HashSet, LinkedHashSet, TreeSet, PriorityQueue, ArrayDeque, etc.)
     * deal with objects only.
     *
     * The java.util package provides the utility classes to deal with objects.
     */
    public static void main(String[] args) {
        // Using constructors (older way, deprecated for some classes)
//        Byte byteObj = new Byte((byte) 5);  // Deprecated
//        Short shortObj = new Short((short) 10);  // Deprecated
//        Integer intObj = new Integer(10);  // Deprecated
//        Long longObj = new Long(1000L);  // Deprecated
//        Float floatObj = new Float(5.5f);  // Deprecated
//        Double doubleObj = new Double(5.55);  // Deprecated
//        Character charObj = new Character('A');  // Deprecated
//        Boolean boolObj = new Boolean(true);  // Deprecated


        // Preferred valueOf() Method (Modern Way)
        Byte byteObj2 = Byte.valueOf((byte) 5);  // Preferred
        Short shortObj2 = Short.valueOf((short) 10);  // Preferred
        Integer intObj2 = Integer.valueOf(10);  // Preferred
        Long longObj2 = Long.valueOf(1000L);  // Preferred
        Float floatObj2 = Float.valueOf(5.5f);  // Preferred
        Double doubleObj2 = Double.valueOf(5.55);  // Preferred
        Character charObj2 = Character.valueOf('A');  // Preferred
        Boolean boolObj2 = Boolean.valueOf(true);  // Preferred

        // Using autoboxing (automatic conversion)
        Integer intObj3 = 20;      // Autoboxing int to Integer
        Double doubleObj3 = 20.5;  // Autoboxing double to Double
        Byte byteObj3 = 10;         // Autoboxing byte to Byte
        Short shortObj3 = 100;      // Autoboxing short to Short
        Long longObj3 = 1000L;      // Autoboxing long to Long
        Float floatObj3 = 15.5f;    // Autoboxing float to Float
        Character charObj3 = 'B';   // Autoboxing char to Character
        Boolean boolObj3 = true;    // Autoboxing boolean to Boolean

        // Printing all the wrapper objects
        System.out.println("Using valueOf() Method (Preferred Way):");
        System.out.println("Byte: " + byteObj2);
        System.out.println("Short: " + shortObj2);
        System.out.println("Integer: " + intObj2);
        System.out.println("Long: " + longObj2);
        System.out.println("Float: " + floatObj2);
        System.out.println("Double: " + doubleObj2);
        System.out.println("Character: " + charObj2);
        System.out.println("Boolean: " + boolObj2);

        System.out.println("\nUsing Autoboxing (Automatic Conversion):");
        System.out.println("Integer: " + intObj3);
        System.out.println("Double: " + doubleObj3);
        System.out.println("Byte: " + byteObj3);
        System.out.println("Short: " + shortObj3);
        System.out.println("Long: " + longObj3);
        System.out.println("Float: " + floatObj3);
        System.out.println("Character: " + charObj3);
        System.out.println("Boolean: " + boolObj3);
    }
}
