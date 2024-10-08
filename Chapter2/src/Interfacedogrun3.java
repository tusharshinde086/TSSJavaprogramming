
interface Animal4 {
    void sound();
}

interface Runnable {
    void run();
}

class Dog2 implements Animal4, Runnable {
    public void sound() {
        System.out.println("Bark");
    }

    public void run() {
        System.out.println("Running...");
    }
}

class Interfacedogrun3 {
    public static void main(String[] args) {
        Dog dog2 = new Dog2();
        dog2.sound();
        dog2.run();
    }
}
