abstract class Animal1 {
    abstract void sound();
}

class Cat extends Animal1 {
    void sound() {
        System.out.println("Meow");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Animal1 cat = new Cat();
        cat.sound();
    }
}
