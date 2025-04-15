package ex_28_Collection_Framework.List;
import java.util.*;
public class Lab185_Vector {


    public static void main(String[] args) {
        // Create a Vector of Strings
        Vector<String> fruits = new Vector<>();

        // Add elements
        fruits.add("Apple");
        fruits.addElement("Banana");
        fruits.addFirst("Cherry");
        fruits.addLast("Guava");
        fruits.add(2,"Mango");
        fruits.add(4, "Blueberry");

        // Display all elements
        System.out.println("Fruits: " + fruits);
        System.out.println("No of Fruits: " + fruits.size());
        System.out.println("-----------------------------");
        // Access elements
        System.out.println("First fruit: " + fruits.firstElement());
        System.out.println("Last fruit: " + fruits.lastElement());
        System.out.println("Fourth fruit: " + fruits.elementAt(3));
        System.out.println("Third fruit: " + fruits.elementAt(2));
        System.out.println("-----------------------------");

        // Remove an element
        fruits.remove("Banana");
        fruits.remove(3);
        fruits.removeElementAt(2);
        System.out.println("Fruits: " + fruits);
        // Display size
        System.out.println("Size: " + fruits.size());
        System.out.println("-----------------------------");
        // Check if it contains an element
        System.out.println("Contains Apple? " + fruits.contains("Apple"));
        System.out.println("Contains Mango? " + fruits.contains("Mango"));

        // Iterate through the Vector
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("-----------------------------");
        fruits.removeAll(Arrays.asList("Apple","Guava"));
        System.out.println(fruits);
        System.out.println(fruits.isEmpty());
        fruits.clear();
        System.out.println(fruits.isEmpty());
        System.out.println(fruits);
    }
}
