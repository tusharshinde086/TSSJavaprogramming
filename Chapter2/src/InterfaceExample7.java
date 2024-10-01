
interface First {
    void display();
}

interface Second {
    void display();
}

class Example implements First, Second {
    public void display() {
        System.out.println("Display method implementation.");
    }
}

class InterfaceExample7 {
    public static void main(String[] args) {
        Example example = new Example();
        example.display();
    }
}
