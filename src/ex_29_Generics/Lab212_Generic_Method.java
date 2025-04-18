package ex_29_Generics;

public class Lab212_Generic_Method {

    // Generic method to print elements of an array
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Integer array
        Integer[] intArray = {1, 2, 3, 4, 5};
        // String array
        String[] stringArray = {"Hello", "World", "Java"};
        // Double array
        Double[] doubleArray = {1.1, 2.2, 3.3};
        // Character array
        Character[] charArray= {'M', 'A', 'N', 'A', 'S', 'A'};

        System.out.println("Integer Array:");
        printArray(intArray);

        System.out.println("String Array:");
        printArray(stringArray);

        System.out.println("Double Array:");
        printArray(doubleArray);

        System.out.println("Character Array:");
        printArray(charArray);
    }
}
