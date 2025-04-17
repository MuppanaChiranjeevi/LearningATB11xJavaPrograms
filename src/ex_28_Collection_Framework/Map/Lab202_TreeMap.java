package ex_28_Collection_Framework.Map;

import java.util.*;

public class Lab202_TreeMap {

    public static void main(String[] args) {
        // Use TreeMap to maintain sorted order by keys
        Map<String, Integer> map = new TreeMap<>();

        // Adding new key-value pairs related to bookstore or library items
        map.put("Harry Potter", 25);  // Price of the book in dollars
        map.put("The Great Gatsby", 15);
        map.put("Moby Dick", 20);
        map.put("1984", 12);
        map.put("Pride and Prejudice", 18);
        map.put("To Kill a Mockingbird", 22);
        map.put("War and Peace", 30);
//        map.put(null, 14);  // Doesn't allow null values as keys
        map.put("The Odyssey", null);
        map.put("The Hobbit", null);

        System.out.println("Initial map: " + map);
        System.out.println("Size of the map: " + map.size());


        // Getting a value
        System.out.println("Harry Potter price: " + map.get("Harry Potter"));
        System.out.println("1984 price: " + map.get("1984"));
        System.out.println("Moby Dick price: " + map.get("Moby Dick"));

        // Check for key or value
        System.out.println("Contains key 'Pride and Prejudice': " + map.containsKey("Pride and Prejudice"));
        System.out.println("Contains key 'The Great Gatsby': " + map.containsKey("The Great Gatsby"));
        System.out.println("Contains value 25: " + map.containsValue(25));
        System.out.println("Contains value 30: " + map.containsValue(30));

        System.out.println("----------------------------");
        // Iterating over entries
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
        System.out.println("----------------------------");
        map.forEach((k, v) -> System.out.println(k + " => " + v));
        System.out.println("----------------------------");
        System.out.println("KeySet(): " + map.keySet());
        System.out.println("Values(): " + map.values());

        // Removing a key
        map.remove("The Hobbit");
        map.remove("1984", 12); // Removes "1984" if its value is 12

        System.out.println("Map after removing entries: " + map);
        System.out.println("----------------------------");
        // Checking if the map is empty
        System.out.println("Is the map empty? " + map.isEmpty());

        // Checking if the map contains any values
        System.out.println("Map contains any values: " + !map.isEmpty());
        System.out.println("----------------------------");
        // Merging two maps (additional method)
        Map<String, Integer> additionalMap = new TreeMap<>();
        additionalMap.put("The Picture of Dorian Gray", 16);
        additionalMap.put("Brave New World", 17);

        map.putAll(additionalMap);  // Merging two maps
        System.out.println("Map after merging with another map: " + map);
        System.out.println("----------------------------");
        map.replace("Harry Potter", 28);  // Changes the price of "Harry Potter" to 28
        map.replace("The Great Gatsby", 20);  // Changes the price of "The Great Gatsby" to 20

        map.replace("Moby Dick", 20, 25);  // Will only replace "Moby Dick" if the price is 20
        map.replace("War and Peace", 30, 35);  // Will only replace "War and Peace" if the price is 30
        System.out.println("Map after replacing: " + map);

        // Clear the map
        map.clear();
        System.out.println("Final map after clearing: " + map);
    }
}
