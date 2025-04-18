package ex_29_Generics;

import java.util.*;

public class Lab207_Without_Generics {
    /**
     * Generics in Java allow you to create classes, interfaces, and methods that work with
     * different types while providing type safety at compile-time.
     * They are most commonly used with collections (like ArrayList, HashMap) but can be applied to classes, methods, and interfaces.
     * ✅ Why Use Generics?
     * Type Safety: Catches type mismatches at compile time rather than runtime
     * Code Reusability: Write a single class/method that works with different data types.
     * Eliminates Type Casting: No need to cast when retrieving objects.
     *
     * Basic Syntax
     * The most common type parameter names are:
     * E - Element (used extensively by the Java Collections Framework)
     * K - Key
     * V - Value
     * T - Type
     * N - Number
     *
     *
     *
     */
    public static void main(String[] args) {
        //Example: Without Generics
        // Without Generics, we can store any type of objects.
        List list = new ArrayList();
        list.add(100);
        list.add("10");
        list.add(true);
        list.add('M');
        list.add(123.987);

        String s = (String) list.get(1); //type casting required
        System.out.println(s);

        int i= (int) list.get(0); //type casting required
        System.out.println(i);

        // Causes Runtime Exception --> java.lang.ClassCastException
        // Uncommenting below lines will throw error at runtime
//        boolean b= (boolean) list.get(3);
//        System.out.println(b);

        System.out.println("--------------------");
        System.out.println("List Elements:");
        for(Object obj:list){
            System.out.println(obj);
        }
    }
}
