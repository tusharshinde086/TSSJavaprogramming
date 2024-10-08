
interface Parent2 {
    void greet();
}

interface Child2 extends Parent2 {
    void sayHello();
}

class Example implements Child2 {
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
