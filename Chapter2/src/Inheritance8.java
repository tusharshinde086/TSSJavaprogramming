interface Animal {
    void sound();
}

class Lion implements Animal {
    public void sound() {
        System.out.println("Lion roars");
    }
}

public class Inheritance8 {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.sound();
    }
}
