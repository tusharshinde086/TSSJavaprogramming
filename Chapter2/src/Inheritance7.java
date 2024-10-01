abstract class Animal {
    abstract void sound();
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Inheritance7 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sound();
    }
}
