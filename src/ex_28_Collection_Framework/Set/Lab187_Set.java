package ex_28_Collection_Framework.Set;

import java.util.*;

public class Lab187_Set {
    /**
     * A Set is a collection that does not allow duplicate elements.
     * Set is an interface that implements the mathematical set.
     * Allows at most one null element
     * There are several classes that implement the Set interface in Java:
     * A Set is useful when you need to store unique elements and don't care about the order in which they are stored.
     * HashSet: Uses a hash table for storage
     *          Offers best performance but no ordering guarantees.
     *          Permits null elements
     *
     * LinkedHashSet: It maintains the order in which elements are inserted.
     *                 Slower than HashSet but faster than TreeSet
     *                 Permits null elements
     *
     * TreeSet: A Set that is sorted, meaning Stores elements in sorted order (natural ordering or by Comparator)
     *          Implements NavigableSet interface
     *          Doesn't permit null elements
     *
     *
     */
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // Duplicate, won't be added
        fruits.add("Orange"); // Duplicate, won't be added
        fruits.add(null);
        fruits.add(null);

        System.out.println("Set:"+fruits);
        System.out.println("Size:"+fruits.size());
        Iterator<String> i=fruits.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        // Removing element
        fruits.remove("Banana");
        System.out.println("Size:"+fruits.size());
        // Clearing the set
        fruits.clear();
        System.out.println("Set:"+fruits);
        System.out.println(fruits.isEmpty());
        System.out.println("---------------------------");
        Set<Integer> a = new HashSet<Integer>();
        a.addAll(Arrays.asList(new Integer[] { 1, 2, 3, 4, 5, 6, 0 }));

        Set<Integer> b = new HashSet<Integer>();
        b.addAll(Arrays.asList(new Integer[] { 1, 5, 4, 6, 7, 0 }));


        // To find union
        Set<Integer> u = new HashSet<Integer>(a);
        u.addAll(b);
        System.out.print("Union of the two Set");
        System.out.println(u);

        // To find intersection
        Set<Integer> in = new HashSet<Integer>(a);
        in.retainAll(b);
        System.out.print("Intersection of the two Set");
        System.out.println(in);

        // To find the symmetric difference
        Set<Integer> d = new HashSet<Integer>(a);
        d.removeAll(b);
        System.out.print("Difference of the two Set");
        System.out.println(d);

    }
}

