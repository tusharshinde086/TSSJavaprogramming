import java.util.LinkedList;
import java.util.ListIterator;

public class FruitLinkedList {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Guava");
        fruits.add("Orange");


        System.out.println("Original LinkedList: " + fruits);

        System.out.print("Fruits in reverse order: ");

        ListIterator<String> iterator = fruits.listIterator(fruits.size());

        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous() + " ");
        }
    }
}
