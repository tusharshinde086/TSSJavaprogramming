
interface Marker {}

class Example implements Marker {
    public void display() {
        System.out.println("This class implements Marker interface.");
    }
}

class InterfaceExample9 {
    public static void main(String[] args) {
        Example example = new Example();
        if (example instanceof Marker) {
            example.display();
        } else {
            System.out.println("Marker not implemented.");
        }
    }
}
