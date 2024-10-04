
interface Animal {
    void sound();
}

interface Runnable {
    void run();
}

class Dog implements Animal, Runnable {
    public void sound() {
        System.out.println("Bark");
    }

    public void run() {
        System.out.println("Running...");
    }
}

class Interfacedogrun3 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.run();
    }
}
