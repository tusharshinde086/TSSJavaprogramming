
interface Parent {
    void greet();
}

interface Child extends Parent {
    void sayHello();
}

class Example implements Child {
    public void greet() {
        System.out.println("Hello from Parent");
    }

    public void sayHello() {
        System.out.println("Hello from Child");
    }
}

class Interfacegreet8 {
    public static void main(String[] args) {
        Example example = new Example();
        example.greet();
        example.sayHello();
    }
}
