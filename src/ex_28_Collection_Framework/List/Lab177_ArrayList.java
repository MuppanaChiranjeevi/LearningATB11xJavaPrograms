package ex_28_Collection_Framework.List;

import java.util.*;

public class Lab177_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");
        al.add("Anuj");
        al.add("Gaurav");
        System.out.println("Initial list1 of elements: "+al);
        ArrayList<String> al2=new ArrayList();
        al2.add("Chiru");
        al2.add("Hanumat");
        al2.addAll(al);
        System.out.println("Initial list2 of elements: "+al2);
        al2.removeAll(al);
        System.out.println("After invoking removeAll() method: "+al2);
        al2.remove("Chiru");
        System.out.println("After invoking remove(object) method: "+al2);
        //Removing element on the basis of specific position
        al2.remove(0);
        System.out.println("After invoking remove(index) method: "+al2);
        System.out.println(al2.isEmpty());
        System.out.println("-------------------------------");
        al2.add("Ravi");
        al2.add("Anuj");
        al2.add("Chiru");
        al2.add("Kiran");
        // Retain only the elements that are present in both al and al2
        al2.retainAll(al);
        System.out.println(al2);
        System.out.println(al2.isEmpty());

    }
}
