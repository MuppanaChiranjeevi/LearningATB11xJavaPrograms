package ex_28_Collection_Framework.Map;

import java.util.*;

public class Lab201_LinkedHashMap {


    public static void main(String[] args) {
        // Use LinkedHashMap to maintain insertion order
        Map<String, Integer> map = new LinkedHashMap<>();

        // Adding new key-value pairs
        map.put("Laptop", 800);
        map.put("Smartphone", 600);
        map.put("Headphones", 150);
        map.put("Smartwatch", 250);
        map.put("Tablet", 400);
        map.put("Charger", 20);
        map.put("USB Cable", null);
        map.put(null, 100);
        map.put(null, null);
        map.put("Bluetooth Speaker", 120);

        System.out.println("Initial map: " + map);
        System.out.println("Size of the map: " + map.size());


        // Getting a value
        System.out.println("Laptop price: " + map.get("Laptop"));
        System.out.println("Smartphone price: " + map.get("Smartphone"));
        System.out.println("Charger price: " + map.get("Charger"));

        // Check for key or value
        System.out.println("Contains key 'Tablet': " + map.containsKey("Tablet"));
        System.out.println("Contains key 'Headphones': " + map.containsKey("Headphones"));
        System.out.println("Contains value null: " + map.containsValue(null));
        System.out.println("Contains value 600: " + map.containsValue(600));

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
        map.remove("Tablet");
        map.remove("Charger", null); // Removes "Charger" if its value is null

        System.out.println("Map after removing entries: " + map);
        System.out.println("----------------------------");
        // Checking if the map is empty
        System.out.println("Is the map empty? " + map.isEmpty());

        // Checking if the map contains any values
        System.out.println("Map contains any values: " + !map.isEmpty());
        System.out.println("----------------------------");
        // Merging two maps (additional method)
        Map<String, Integer> additionalMap = new LinkedHashMap<>();
        additionalMap.put("Keyboard", 50);
        additionalMap.put("Mouse", 30);

        map.putAll(additionalMap);  // Merging two maps
        System.out.println("Map after merging with another map: " + map);
        System.out.println("----------------------------");
        map.replace("Laptop", 850);  // Changes the value of "Laptop" to 850
        map.replace("Smartphone", 700);  // Changes the value of "Smartphone" to 700

        map.replace("Headphones", 150, 170);  // Will only replace "Headphones" if the value is 150
        map.replace("USB Cable", 10, 15);  // Will only replace "USB Cable" if the value is 10
        System.out.println("Map after replacing: " + map);

        // Clear the map
        map.clear();
        System.out.println("Final map after clearing: " + map);
    }
}
