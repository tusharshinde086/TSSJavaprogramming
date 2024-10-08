
interface First {
    void display();
}

interface Second {
    void display();
}

class Example4 implements First, Second {
    public void display() {

        System.out.println("Display method implementation.");
    }
}

class InterfaceExample7 {
    public static void main(String[] args) {
        Example4 example4 = new Example4();
        example4.display();
    }
}
