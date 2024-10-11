package Iterable.Collection.Set.SortedSet.TreeSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet {
        public static void main(String[] args) {
            
            SortedSet<String> friendsSet = new TreeSet<>();
    
            friendsSet.add("Alice");
            friendsSet.add("Bob");
            friendsSet.add("Charlie");
            friendsSet.add("David");
            friendsSet.add("Alice"); 
    
            // Display the SortedSet
            System.out.println("Friends SortedSet: " + friendsSet);
    
            // First and last elements
            System.out.println("First friend: " + friendsSet.first());
            System.out.println("Last friend: " + friendsSet.last());
    
            // Remove a friend from the SortedSet
            boolean isRemoved = friendsSet.remove("Charlie");
            System.out.println("Was Charlie removed? " + isRemoved);
            System.out.println("Friends SortedSet after removing Charlie: " + friendsSet);
    
            // Size of the SortedSet
            System.out.println("Size of the Friends SortedSet: " + friendsSet.size());
    
            // Check if the SortedSet is empty
            System.out.println("Is the Friends SortedSet empty? " + friendsSet.isEmpty());
    
            // Iterating through the SortedSet
            System.out.println("Iterating through the Friends SortedSet:");
            for (String friend : friendsSet) {
                System.out.println(friend);
            }
    
            friendsSet.clear();
            System.out.println("Friends SortedSet after clearing: " + friendsSet);
            System.out.println("Is the Friends SortedSet empty after clearing? " + friendsSet.isEmpty());
        }
    }
    
