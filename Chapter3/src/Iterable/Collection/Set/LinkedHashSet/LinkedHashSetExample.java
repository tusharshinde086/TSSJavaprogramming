package Iterable.Collection.Set.LinkedHashSet;
import java.util.LinkedHashSet;
    
public class LinkedHashSetExample {
        public static void main(String[] args) {
            // Create a LinkedHashSet
            LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
    
            // Adding elements to the LinkedHashSet
            linkedHashSet.add("Apple");
            linkedHashSet.add("Banana");
            linkedHashSet.add("Cherry");
            linkedHashSet.add("Banana"); // Duplicate, will not be added
    
            System.out.println("LinkedHashSet: " + linkedHashSet);
    
            // Checking if an element exists
            if (linkedHashSet.contains("Apple")) {
                System.out.println("LinkedHashSet contains Apple");
            } else {
                System.out.println("LinkedHashSet does not contain Apple");
            }
    
            // Removing an element
            linkedHashSet.remove("Cherry");
            System.out.println("LinkedHashSet after removing Cherry: " + linkedHashSet);
    
            // Iterating through the LinkedHashSet
            System.out.println("Iterating through LinkedHashSet:");
            for (String fruit : linkedHashSet) {
                System.out.println(fruit);
            }
    
            // Clearing the LinkedHashSet
            linkedHashSet.clear();
            System.out.println("LinkedHashSet after clearing: " + linkedHashSet);
        }
    }
    
