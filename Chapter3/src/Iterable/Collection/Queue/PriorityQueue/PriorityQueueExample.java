package Iterable.Collection.Queue.PriorityQueue;
import java.util.PriorityQueue;
    
public class PriorityQueueExample {
        public static void main(String[] args) {
            // Create a PriorityQueue
            PriorityQueue<Integer> queue = new PriorityQueue<>();
    
            // Adding elements to the PriorityQueue
            queue.add(5);
            queue.add(1);
            queue.add(3);
            queue.add(7);
            queue.add(2);
            
            System.out.println("PriorityQueue: " + queue);
    
            // Removing elements from the PriorityQueue (highest priority first)
            while (!queue.isEmpty()) {
                System.out.println("Removed: " + queue.poll());
                System.out.println("Current PriorityQueue: " + queue);
            }
    
            // Adding elements again
            queue.add(10);
            queue.add(4);
            queue.add(6);
            System.out.println("PriorityQueue after adding new elements: " + queue);
    
            // Peeking at the highest priority element
            System.out.println("Peek: " + queue.peek());
        }
    }
    
