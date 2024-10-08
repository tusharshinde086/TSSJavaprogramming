class Parent5 {
    void display() {

        System.out.println("Parent class");
    }
}

class Child3 extends Parent5 {
    void show() {
        System.out.println("Child 1");
    }
}

class child5 extends Parent5 {
    void print() {

        System.out.println("Child 2");
    }
}

public class Inheritance4 {
    public static void main(String[] args) {
        child5 c1 = new child5();
        child5 c2 = new child5();
        c1.display();
        c2.display();
    }
}

