package ex_28_Collection_Framework.Set;

import java.util.LinkedHashSet;

public class Lab192_LinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();

        lhs.add("Java");
        lhs.add("T");
        lhs.add("Point");
        lhs.add("Good");
        lhs.add("Website");

        System.out.println("The hash set is: " + lhs);
        // since the element "Good" is present, therefore, the method remove()
        // returns true
        System.out.println(lhs.remove("Good"));

        // After removing the element
        System.out.println("After removing the element, the hash set is: " + lhs);
        // since the element "For" is not present, therefore, the method remove()
        // returns false
        System.out.println(lhs.remove("For"));
    }
}
