package ex_28_Collection_Framework.Set;

import java.util.*;

public class Lab194_TreeSet {
    /**
     *  TreeSet class in Java is a part of the java.util package and implements the Set interface.
     *  TreeSet uses a Tree(red – black tree) for storage.
     *  TreeSet stores elements in a sorted(ascending) order and does not allow duplicates.
     *  The TreeSet implements a NavigableSet interface by inheriting AbstractSet class.
     *  Key Features of TreeSet:
     *      Stores unique elements (no duplicates), it doesn't allow duplicate elements.
     *      Elements are stored in sorted order (ascending order) by default.
     *      Doesn't allow null elements.
     *      Not synchronized (not thread-safe).
     *      Internally uses a Red-Black tree data structure for storage.
     *
     */
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
// Duplicate won't be added
        colors.add("Red");
        colors.add("Blue");
//        colors.add(null);  // NullPointerException

        System.out.println(colors); // [Blue, Green, Red, Yellow] --> Sorted in Ascending Order
        System.out.println(colors.size());
        System.out.println(colors.isEmpty());

        System.out.println("First element: " + colors.first());
        System.out.println("Last element: " + colors.last());

        System.out.println(colors);
        System.out.println("removes and returns first element: " + colors.pollFirst());
        System.out.println(colors);
        System.out.println("removes and returns last element: " + colors.pollLast());
        System.out.println(colors);
        colors.clear();
        System.out.println(colors);
        System.out.println("--------------------------");
        TreeSet<String> colors2 = new TreeSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        colors.addAll(colors2);

        Iterator<String> it = colors.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\n");

        // Using enhanced for loop
        for (String lang : colors) {
            System.out.println(lang);
        }

        System.out.println("\n");

        it = colors.descendingIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\n");

        // Using forEach (Java 8+)
        colors.forEach(System.out::println);

    }
}
