package ex_11_Strings;

public class Lab067_StringBuffer {
    /**
     * The StringBuffer class in Java  is used to create mutable (modifiable) String objects.
     * The StringBuffer class in Java is same as String class except it is mutable i.e. it can be changed.
     * Note: The StringBuffer class in Java is thread-safe means multiple threads cannot access it simultaneously.
     * So it is safe and will result in an order.
     *
     *  Unlike the String class, which is immutable (means every modification creates a new object),
     *  StringBuffer class allows modifications without creating new objects, making it more efficient for string manipulations.
     *  The StringBuffer class was introduced in Java 1.0
     */
    public static void main(String[] args) {
        // There are multiple ways to create a StringBuffer object
        // 1. Default Constructor
        StringBuffer sb0 = new StringBuffer();
        System.out.println(sb0.capacity());  // Output: 16

        // 2. Creating StringBuffer with an Initial String
        StringBuffer sb1 = new StringBuffer("Hello");
        System.out.println(sb1);  // Output: Hello
        System.out.println(sb1.capacity());  // Output: 21

        // 3. Creating StringBuffer with a Specified Capacity
        StringBuffer sb2 = new StringBuffer(50);  // Allocates buffer for 50 characters
        System.out.println(sb2.capacity());  // Output: 50

        /*
        Feature	           String	    StringBuffer	   StringBuilder

        Mutability	       Immutable	 Mutable            Mutable
        Performance	       Slow          Faster	            Fastest
        Thread-Safety	Yes (Immutable)	Yes (Synchronized)	No
         */




    }
}
