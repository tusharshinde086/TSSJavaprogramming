package Iterable.Collection.Set.HashSet;
    import java.util.HashSet;    

    public class HashSetExample {
        public static void main(String[] args) {
            // Create a HashSet
            HashSet<String> hashSet = new HashSet<>();
    
            // Adding elements to the HashSet
            hashSet.add("Apple");
            hashSet.add("Banana");
            hashSet.add("Cherry");
            hashSet.add("Banana"); // Duplicate, will not be added
    
            System.out.println("HashSet: " + hashSet);
    
            // Checking if an element exists
            if (hashSet.contains("Apple")) {
                System.out.println("HashSet contains Apple");
            } else {
                System.out.println("HashSet does not contain Apple");
            }
    
            // Removing an element
            hashSet.remove("Cherry");
            System.out.println("HashSet after removing Cherry: " + hashSet);
    
            // Iterating through the HashSet
            System.out.println("Iterating through HashSet:");
            for (String fruit : hashSet) {
                System.out.println(fruit);
            }
            
            // Clearing the HashSet
            hashSet.clear();
            System.out.println("HashSet after clearing: " + hashSet);
        }
    }
    
