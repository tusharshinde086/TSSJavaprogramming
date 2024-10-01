class FinalClass {
    final void display() {
        System.out.println("Final method");
    }
}

class SubClass extends FinalClass {
    // Cannot override the final method
}

public class Inheritance10 {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.display();
    }
}
