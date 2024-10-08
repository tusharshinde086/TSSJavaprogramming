package Iterable.Collection.List.Vector.Stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        System.out.println("Stack after pushes: " + stack);

        // Peeking at the top element
        String top = stack.peek();
        System.out.println("Top element: " + top);

        // Popping elements from the stack
        String popped = stack.pop();
        System.out.println("Popped element: " + popped);
        System.out.println("Stack after pop: " + stack);

        // Checking if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty);

        // Searching for an element
        int position = stack.search("Banana");
        System.out.println("Position of Banana in stack: " + position);

        // Clearing the stack
        stack.clear();
        System.out.println("Stack after clearing: " + stack);
    }
}
