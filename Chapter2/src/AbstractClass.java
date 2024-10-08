abstract class Animal1 {
    abstract void sound();
}

class Cat3 extends Animal1 {
    void sound() {
        System.out.println("Meow");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Cat3 cat = new Cat3();
        cat.sound();
    }
}
