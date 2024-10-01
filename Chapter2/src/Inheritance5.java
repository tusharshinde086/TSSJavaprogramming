class Parent {
    int x = 10;
}

class Child extends Parent {
    int x = 20;

    void display() {
        System.out.println("Parent x: " + super.x);
        System.out.println("Child x: " + x);
    }
}

public class Inheritance5 {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}
