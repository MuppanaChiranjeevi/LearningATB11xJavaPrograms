package ex_11_Strings;

public class Lab069_StringBuilder {
    /**
     * The StringBuilder class in Java  is used to create mutable (modifiable) String objects.
     * The StringBuilder class in Java is same as StringBuffer class except it is non-synchronized  i.e. not thread safe.
     * Note: The StringBuilder class in Java is not thread-safe means multiple threads can access it simultaneously.
     *
     *  Unlike the String class, which is immutable (means every modification creates a new object),
     *  StringBuilder class allows modifications without creating new objects, making it more efficient for string manipulations.
     *  The StringBuilder class was introduced in Java 1.5
     */
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();  // Default capacity (16 characters)
        StringBuilder sb2 = new StringBuilder("Hello");  // Initialized with a string
        StringBuilder sb3 = new StringBuilder(50);  // Specified capacity

        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(sb3);

        System.out.println(sb1.capacity());
        System.out.println(sb2.capacity());
        System.out.println(sb3.capacity());

        System.out.println("---------------Common Methods of StringBuilder-----------------");

        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);  // Output: Hello
        sb.append(" World");
        System.out.println(sb);  // Output: Hello World

        sb.insert(5, " Java");
        System.out.println(sb);  // Output: Hello Java World

        sb.replace(6, 10, "C++");
        System.out.println(sb);  // Output: Hello C++ World

        sb.delete(5, 9);
        System.out.println(sb);  // Output: Hello World

        sb.reverse();
        System.out.println(sb);  // Output: dlroW olleH

        System.out.println("--------------------------------");
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.length());
        sb.setLength(5);
        System.out.println(sb.length());



    }
}
