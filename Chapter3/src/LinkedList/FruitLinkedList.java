package LinkedList;

import java.util.LinkedList;
import java.util.Iterator;

public class FruitLinkedList {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();


        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Guava");
        fruits.add("Orange");

        Iterator<String> iterator = fruits.iterator();

        System.out.println("Fruits in the LinkedList:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
