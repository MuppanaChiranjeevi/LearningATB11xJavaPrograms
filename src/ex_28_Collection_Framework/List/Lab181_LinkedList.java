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

        System.out.println("Initial LinkedList " + ll);

        ll.set(1, "For");
        ll.set(3,"Java");

        System.out.println("Updated LinkedList " + ll);

    }
}
