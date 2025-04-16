package ex_28_Collection_Framework.Set;

import java.util.*;

public class Lab195_TreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> nums = new TreeSet<>();
        for (int i = 1; i <= 10; i++){
            nums.add(i);
        }

        nums.forEach(System.out::println);
        System.out.println("Initial Set: "+nums);
        System.out.println("Reverse Set: "+nums.descendingSet());
        System.out.println(nums.size());

        System.out.println("-------------------------");
        // Elements greater than or equal to 5
        System.out.println(nums.tailSet(5)); // [5, 6, 7, 8, 9, 10]

        // Elements less than 5
        System.out.println(nums.headSet(5)); // [1, 2, 3, 4]

        // Elements between 3 (inclusive) and 7 (exclusive)
        System.out.println(nums.subSet(3, 7)); // [3, 4, 5, 6]
        System.out.println(nums.subSet(4, 9)); // [4, 5, 6, 7, 8]
        System.out.println("-------------------------");

        System.out.println("Lowest Value: "+nums.pollFirst());
        System.out.println("Highest Value: "+nums.pollLast());
        System.out.println(nums);
        System.out.println(nums.size());
        System.out.println("Contains 6 "+nums.contains(6));
        System.out.println("Contains 4 "+nums.contains(4));
        System.out.println("Contains 0 "+nums.contains(0));

        System.out.println("------------------------------");
        TreeSet<String> set=new TreeSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");

        System.out.println("Intial Set: "+set);

        System.out.println("Head Set: "+set.headSet("C"));

        System.out.println("SubSet: "+set.subSet("A", "D"));

        System.out.println("TailSet: "+set.tailSet("C"));
    }
}
