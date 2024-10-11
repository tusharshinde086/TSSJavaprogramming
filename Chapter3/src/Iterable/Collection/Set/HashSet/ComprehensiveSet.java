package Iterable.Collection.Set.HashSet;
import java.util.HashSet;
import java.util.Set;

    public class ComprehensiveSet {
        public static void main(String[] args) {

            // Create a Set using HashSet
            Set<String> fruitsSet = new HashSet<>();
    
            // Adding elements to the Set
            fruitsSet.add("Apple");
            fruitsSet.add("Banana");
            fruitsSet.add("Cherry");
            fruitsSet.add("Date");
            fruitsSet.add("Banana"); // Duplicate, will not be added
    
            // Display the Set
            System.out.println("Fruits Set: " + fruitsSet);
    
            // Check if the Set contains a specific element
            if (fruitsSet.contains("Apple")) {
                System.out.println("The Set contains Apple.");
            } else {
                System.out.println("The Set does not contain Apple.");
            }
    
            // Remove an element from the Set
            boolean isRemoved = fruitsSet.remove("Cherry");
            System.out.println("Was Cherry removed? " + isRemoved);
            System.out.println("Fruits Set after removal: " + fruitsSet);
    
            // Size of the Set
            System.out.println("Size of the Set: " + fruitsSet.size());
    
            // Check if the Set is empty
            System.out.println("Is the Set empty? " + fruitsSet.isEmpty());
    
            // Iterating through the Set
            System.out.println("Iterating through the Set:");
            for (String fruit : fruitsSet) {
                System.out.println(fruit);
            }
    
            // Clearing the Set
            fruitsSet.clear();
            System.out.println("Fruits Set after clearing: " + fruitsSet);
    
            // Checking if the Set is empty again
            System.out.println("Is the Set empty after clearing? " + fruitsSet.isEmpty());

        }

    }
    
