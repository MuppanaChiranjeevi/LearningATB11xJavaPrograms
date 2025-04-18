package ex_29_Generics;

import java.util.*;

public class Lab208_With_Generics {

    public static void main(String[] args) {
        // Example: With Generics
        // With Generics, it is required to specify the type of object we need to store.
        List<String> al = new ArrayList<String> ();
        al.add("Sweta");
        al.add("Gudly");
        al.add("rahul");
        al.add("jai");

        // Compile-Time Checking: It is checked at compile time so problem will not occur at runtime.
//        al.add(10);    // ❌ Compile-time error
//        al.add(true);  // ❌ Compile-time error
//        al.add('C');   // ❌ Compile-time error

        String s1 = al.get(1); //type casting not required
        System.out.println(s1);

        String s2= al.get(3); //type casting not required
        System.out.println(s2);

        System.out.println("--------------------");
        System.out.println("List Elements:");
        for(String obj:al){
            System.out.println(obj);
        }
    }
}
