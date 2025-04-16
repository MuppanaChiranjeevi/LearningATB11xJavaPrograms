package ex_28_Collection_Framework.Set;

import java.util.HashSet;

public class Lab190_HashSet_Example {

    public static void main(String[] args) {
        // Create a HashSet of String type
        HashSet<String> cars = new HashSet<>();

        // Add elements to the HashSet
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");    // Duplicate element - will be ignored
        cars.add("Mazda");

        System.out.println("HashSet: " + cars);

        // Check if an element exists
        System.out.println("Contains Mazda: " + cars.contains("Mazda"));

        // Remove an element
        cars.remove("Volvo");
        System.out.println("After removing Volvo: " + cars);

        // Size of the HashSet
        System.out.println("Size: " + cars.size());

        // Iterate through the HashSet
        System.out.println("Iterating through HashSet:");
        for (String car : cars) {
            System.out.println(car);
        }
    }
}

