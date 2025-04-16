package ex_28_Collection_Framework.List;

import java.util.*;

public class Lab186_Stack {
    /**
     * The Stack class in Java is part of the Java Collection Framework and is used to represent a last-in, first-out (LIFO) stack of objects.\
     * Inherits from: Vector (which means it has dynamic array features)  and provides additional operations for stack manipulation.
     *
     * Key Features
     * LIFO Principle: (Last-In-First-Out) The last element added is the first one to be removed
     * Synchronized: All operations are thread-safe (like Vector)
     * Part of Java Collections Framework: Though considered legacy, it's still available
     * Main Methods
     * push(E item) - Adds an item to the top of the stack
     * pop() - Removes and returns the top item from the stack
     * peek() - Returns the top item without removing it
     * empty() - Checks if the stack is empty
     * search(Object o) - Returns the 1-based position of an object in the stack
     */
    public static void main(String[] args) {
        Stack stack1 = new Stack();
        // pushing the elements
        stack1.push("4");
        stack1.push("All");
        stack1.push(true);
        stack1.push(123.456);
        stack1.push('J');
        System.out.println(stack1);
        System.out.println("-----------------------------");
        Stack<String> stack = new Stack<>();

        // Push items
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");
        System.out.println(stack);
        System.out.println("Top element: " + stack.peek()); // C++
        System.out.println("Popped: " + stack.pop());       // C++
        System.out.println("Is empty? " + stack.isEmpty()); // false
        System.out.println("Position of 'Java': " + stack.search("Java")); // 2

        stack.clear();
        System.out.println("-------------------------");

        // Pushing elements
        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        stack.push("Four");
        System.out.println(stack);
        // Peeking at the top element
        System.out.println("Top element: " + stack.peek());

        // Popping elements
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        // Checking if empty
        System.out.println("Is stack empty? " + stack.empty()); // false

        // Searching (returns 1-based position)
        System.out.println("Position of 'First': " + stack.search("First"));
        System.out.println("Position of 'Second': " + stack.search("Second"));
        System.out.println("Position of 'Third': " + stack.search("Third"));

    }
}


