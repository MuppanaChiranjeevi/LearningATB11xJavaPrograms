package ex_28_Collection_Framework.Map;

import java.util.*;

public class Lab199_Map {
    /**
     * The Map interface in Java is part of the Java Collections Framework and is used to store data in key-value pairs.
     * Map does not allow duplicate keys, but it can have duplicate values.
     * Each key maps to exactly one value
     * Key Characteristics
             * Key-value pairs: Stores data as pairs (key → value)
             * Unique keys: No duplicate keys allowed (each key maps to exactly one value)
     *
     * Common implementations: HashMap, LinkedHashMap, TreeMap, Hashtable
     * HashMap and LinkedHashMap allow one null key and multiple null values,
     *      but TreeMap does not allow any null key, while it allows multiple null values.
     * Hashtable --> Legacy class, synchronized, does not allow null key or null values.
     *
     * A Map can't be traversed, so you need to convert it into Set using keySet() or entrySet() method.
     *
     * HashMap --> Unordered, allows one null key and multiple null values
     * TreeMap --> Sorted based on natural order or a custom comparator
     * LinkedHashMap --> Maintains insertion order
     *
     * Here are some important methods:
             * put(K key, V value) - Associates the specified value with the specified key
             * get(Object key) - Returns the value to which the specified key is mapped
             * remove(Object key) - Removes the mapping for a key
             * containsKey(Object key) - Returns true if the map contains the specified key
             * containsValue(Object value) - Returns true if the map contains the specified value
             * size() - Returns the number of key-value mappings
             * isEmpty() - Returns true if the map is empty
             * keySet() - Returns a Set view of the keys
             * values() - Returns a Collection view of the values
             * entrySet() - Returns a Set view of the mappings
     */
    public static void main(String[] args) {
        Map<Object, Object> map = new HashMap<>();

        map.put("Name", "Amit");               // String -> String
        map.put("Roll No", 2314);              // String -> Integer
        map.put("Salary", 28956.097);          // String -> Double
        map.put("Is Working", true);           // String -> Boolean
        map.put("Gender", 'M');                // String -> Character
        map.put(1001, "Employee ID");          // Integer -> String
        map.put(1.5, "Version 1.5");           // Double -> String
        map.put(null, "No Key");               // null -> String
        map.put(10, null);                     // Integer -> null
        map.put(false, "Not Active");          // Boolean -> String
        map.put(null,null);                    // null -> null
        map.put(1,null);                       // Integer -> null
        map.put(2,null);                       // Integer -> null
        System.out.println(map);

        System.out.println("\n-- Using entrySet() --");
        for (Object obj : map.entrySet()) {
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        System.out.println("\n-- Using forEach (Java 8+) --");
        map.forEach((k, v) -> System.out.println(k + " => " + v));



    }
}
