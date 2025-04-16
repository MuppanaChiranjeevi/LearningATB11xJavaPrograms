package ex_28_Collection_Framework.Set;
import java.util.*;
public class Lab193_LinkedHashset {

    public static void main(String[] args) {

        // Create a LinkedHashSet
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // Add elements
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Orange");
        set.add("Banana"); // Duplicate - won't be added
        set.add("Orange"); // Duplicate - won't be added
        set.add(null);     // Allows one null
        set.add(null);     // Allows one null

        // Display elements
        System.out.println("LinkedHashSet: " + set); // Maintains insertion order

        // Size of the set
        System.out.println("Size: " + set.size());

        // Check if empty
        System.out.println("Is empty? " + set.isEmpty());

        // Contains a specific element
        System.out.println("Contains 'Mango'? " + set.contains("Mango"));
        System.out.println("Contains 'Grapes'? " + set.contains("Grapes"));

        // Remove an element
        set.remove("Banana");
        System.out.println("After removing 'Banana': " + set);

        // Iterate using for-each
        System.out.print("Iterating with for-each: ");
        for (String fruit : set) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // Iterate using Iterator
        System.out.print("Iterating with Iterator: ");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // Clone the set (shallow copy)
        LinkedHashSet<String> clonedSet = (LinkedHashSet<String>) set.clone();
        System.out.println("Cloned set: " + clonedSet);

        // Clear the set
        set.clear();
        System.out.println("After clearing: " + set);
        System.out.println("Is empty after clear? " + set.isEmpty());
    }
}
