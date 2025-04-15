package ex_28_Collection_Framework.List;

import java.util.*;

public class Lab181_LinkedList {
    public static void main(String args[])
    {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("Geeks");
        ll.add("Geeks");
        ll.add(1, "Geeks");
        ll.add("Chiru");
        ll.add(4,"TechPoint");
        ll.addLast("null");
        ll.addFirst("null");

        System.out.println("Initial LinkedList " + ll);

        ll.set(2, "For");
        ll.set(4,"Java");
        ll.set(0,"websites");

        System.out.println("Updated LinkedList " + ll);

    }
}
