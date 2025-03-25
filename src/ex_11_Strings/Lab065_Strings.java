package ex_11_Strings;

public class Lab065_Strings {
    /**
     * String is a sequence of characters.
     * String is actually a built-in class in Java, defined in the java.lang package.
     * Strings in Java are immutable, meaning once a String object is created, its value cannot be changed.
     * Any operation that tries to modify a string actually creates a new String object.
     * The java.lang.String class implements Serializable, Comparable and CharSequence interfaces.
     * There are two ways to create a string:
     * 1. By string literal  -> Java String literal is created by using double quotes.
     * 2. By new keyword
     * Strings in Java are stored in a special memory region called the "string constant pool".
     * When you create a string using a literal, JVM checks the "string constant pool" first.
     * If that exact string already exists in the pool, a reference to the pooled instance is returned.
     * If the string doesn't exist in the pool, a new string instance is created and placed in the pool.
     */
    public static void main(String[] args) {
        String name="CHIRANJEEVI";  // string constant pool
        String surname=new String("MUPPANA");

        System.out.println(name);
        System.out.println(surname);

        System.out.println("-------------------------");

        name.toLowerCase();
        surname.concat(name);

        System.out.println(name);  //Strings are immutable, means its value cannot be changed once created
        System.out.println(surname);

        System.out.println("-------------------------");

        name=name.toLowerCase();
        surname=surname.concat(name);

        System.out.println(name);
        System.out.println(surname);

        System.out.println("-------------------------");
        String str1="Chiru";
        String str2="Chiru";
        String str3 = new String("Chiru");
        String str4 = new String("Chiru");
        // When you create a string using new keyword, JVM will create a new string object in normal (non-pool) heap memory,
        // and the literal "Chiru" will be placed in the string constant pool.
        // The variable str4 will refer to the object in a heap memory.
        // This explicitly creates a new object in memory, even if an identical string exists in the string pool.


        // == operator compares whether two variables are pointing to the same object in memory.

        System.out.println(str1 == str2); // true because both pointing to the same object in the string pool
        System.out.println(str1 == str3); // false because both pointing to the different objects in memory.
        System.out.println(str1 == str4);
        System.out.println("-------------------------");
        System.out.println(str3 == str4);
        System.out.println("-------------------------");
        // equals() method compares if two strings are equal (case-sensitive)
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str4));



    }
}
