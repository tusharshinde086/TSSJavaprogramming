
interface Animal3 {
    void sound();

    default void sleep() {

        System.out.println("Sleeping...");
    }
}

class Dog implements Animal3 {
    public void sound() {

        System.out.println("Bark");
    }
}

class Interfaceanimal2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.sleep();
    }
}
