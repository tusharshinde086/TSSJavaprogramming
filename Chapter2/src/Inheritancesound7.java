abstract class Animal2 {
    abstract void sound();
}

class Cat extends Animal2 {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Inheritancesound7 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sound();
    }
}
