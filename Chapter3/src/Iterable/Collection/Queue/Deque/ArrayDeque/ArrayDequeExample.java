package Iterable.Collection.Queue.Deque.ArrayDeque;
import java.util.ArrayDeque;

    public class ArrayDequeExample {
        public static void main(String[] args) {
            // Create an ArrayDeque
            ArrayDeque<String> deque = new ArrayDeque<>();
            
            // Adding elements to the ArrayDeque
            deque.add("Apple");
            deque.add("Banana");
            deque.add("Cherry");

            System.out.println("Initial ArrayDeque: " + deque);
    
            // Adding elements to the front and back
            deque.addFirst("Mango");
            deque.addLast("Orange");
    
            System.out.println("ArrayDeque after additions: " + deque);
    
            // Removing elements from the front and back
            String firstElement = deque.removeFirst();
            String lastElement = deque.removeLast();
    
            System.out.println("Removed first element: " + firstElement);
            System.out.println("Removed last element: " + lastElement);
            System.out.println("ArrayDeque after removals: " + deque);
    
            // Peeking at the first and last elements
            System.out.println("First element: " + deque.peekFirst());
            System.out.println("Last element: " + deque.peekLast());
    
            // Clearing the ArrayDeque
            deque.clear();
            System.out.println("ArrayDeque after clearing: " + deque);
        }
    }
