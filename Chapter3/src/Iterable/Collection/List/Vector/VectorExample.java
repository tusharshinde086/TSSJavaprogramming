package Iterable.Collection.List.Vector;

    import java.util.Vector;
    
    public class VectorExample {
        public static void main(String[] args) {
            Vector<String> fruits = new Vector<>();
    
            fruits.add("Apple");
            fruits.add("Banana");
            fruits.add("Cherry");
            System.out.println("Initial Vector: " + fruits);
    
            fruits.add(1, "Mango");
            System.out.println("After adding Mango: " + fruits);
    
            fruits.remove(2);
            System.out.println("After removing element at index 2: " + fruits);
    
            String fruit = fruits.get(1);
            System.out.println("Element at index 1: " + fruit);
    
            System.out.println("Size of the Vector: " + fruits.size());
    
            System.out.println("Iterating over the Vector:");
            for (String f : fruits) {
                System.out.println(f);
            }
    
            boolean containsApple = fruits.contains("Apple");
            System.out.println("Does the Vector contain Apple? " + containsApple);
    
            fruits.clear();
            System.out.println("Vector after clearing: " + fruits);
        }
    }
    
