interface CanRun {
    void run();
}

interface CanSwim {
    void swim();
}

class Frog implements CanRun, CanSwim {
    public void run() {
        System.out.println("Frog runs");
    }

    public void swim() {
        System.out.println("Frog swims");
    }
}

public class Inheritance9 {
    public static void main(String[] args) {
        Frog frog = new Frog();
        frog.run();
        frog.swim();
    }
}
