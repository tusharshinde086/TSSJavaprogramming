package InheritanceInterface;

interface Display {
    void show();
}

class Message {
    void print(Display display) {
        display.show();
    }
}

class Interface14 {
    public static void main(String[] args) {
        Message msg = new Message();
        msg.print(() -> System.out.println("Lambda expression example"));
    }
}

