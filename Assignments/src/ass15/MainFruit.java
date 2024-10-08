package ass15;

import java.util.LinkedList;

interface FruitList {
    void addFruit(String fruit);
    void displayInReverse();
}

class FruitLinkedList implements FruitList {
    private LinkedList<String> fruits;

    public FruitLinkedList() {
        fruits = new LinkedList<>();
    }

    @Override
    public void addFruit(String fruit) {
        fruits.add(fruit);
    }

    @Override
    public void displayInReverse() {
        for (int i = fruits.size() - 1; i >= 0; i--) {
            System.out.println(fruits.get(i));
        }
    }
}

public class MainFruit {
    public static void main(String[] args) {
        FruitLinkedList fruitList = new FruitLinkedList();

        fruitList.addFruit("Apple");
        fruitList.addFruit("Banana");
        fruitList.addFruit("Guava");
        fruitList.addFruit("Orange");

        System.out.println("Fruits in reverse order:");
        fruitList.displayInReverse();
    }
}
