class Bird {
    void fly() {
        System.out.println("Flying");
    }
}

class Ostrich extends Bird {
    void fly() {
        System.out.println("Cannot fly");
    }
}

public class PolimorphismsBird {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Bird ostrich = new Ostrich();
        bird.fly();
        ostrich.fly();
    }
}

