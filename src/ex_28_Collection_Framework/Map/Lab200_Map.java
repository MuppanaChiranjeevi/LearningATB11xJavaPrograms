package ex_28_Collection_Framework.Map;

import java.util.*;

public class Lab200_Map {

        public static void main(String[] args) {
            Map<String, Integer> map = new HashMap<>();

            // Adding key-value pairs
            map.put("Apple", 30);
            map.put("Banana", 5);
            map.put("Orange", 15);
            map.put("Mango",25);
            map.put("Grapes", 10);
            map.put("Cherry", null);
            map.put(null, 50);
            map.put(null, null);
            map.put("Papaya", null);
            System.out.println("Initial map: " + map);
            System.out.println("Size of the map: " + map.size());


            // Getting a value
            System.out.println("Apple count: " + map.get("Apple"));
            System.out.println("Orange count: " + map.get("Orange"));
            System.out.println("Orange count: " + map.get("Cherry"));

            // Check for key or value
            System.out.println("Contains key 'Banana': " + map.containsKey("Banana"));
            System.out.println("Contains key 'Cherry': " + map.containsKey("Cherry"));
            System.out.println("Contains value null: " + map.containsValue(null));
            System.out.println("Contains value 25: " + map.containsValue(25));

            System.out.println("----------------------------");
            // Iterating over entries
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " => " + entry.getValue());
            }
            System.out.println("----------------------------");
            map.forEach((k,v)->System.out.println(k + " => " + v));
            System.out.println("----------------------------");
            System.out.println("KeySet(): "+map.keySet());
            System.out.println("Values():"+map.values());


            // Removing a key
            map.remove("Orange");
            map.remove("Papaya",null); //// Removes "Papaya" if its value is null

            System.out.println("Map after removing entries: " + map);
            System.out.println("----------------------------");
            // Checking if the map is empty
            System.out.println("Is the map empty? " + map.isEmpty());

            // Checking if the map contains any values
            System.out.println("Map contains any values: " + !map.isEmpty());
            System.out.println("----------------------------");
            // Merging two maps (additional method)
            Map<String, Integer> additionalMap = new HashMap<>();
            additionalMap.put("Pineapple", 20);
            additionalMap.put("Peach", 7);

            map.putAll(additionalMap);  // Merging two maps
            System.out.println("Map after merging with another map: " + map);
            System.out.println("----------------------------");
            map.replace("Apple", 35);  // Changes the value of "Apple" to 35
            map.replace("Banana", 15);  // Changes the value of "Banana" to 15

            map.replace("Mango", 25, 30);  // Will only replace "Mango" if the value is 25
            map.replace("Grapes", 20, 40);  // Will only replace "Grapes" if the value is 20
            System.out.println("Map after replacing  " + map);

            // Clear the map
            map.clear();
            System.out.println("Final map after clearing: " + map);
        }
    }


