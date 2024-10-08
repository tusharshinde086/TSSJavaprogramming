
interface Marker {}

class Example3 implements Marker {
    public void display() {
        System.out.println("This class implements Marker interface.");
    }
}

class InterfaceExample9 {
    public static void main(String[] args) {
        Example example3 = new Example();
        if (example3 instanceof Marker) {
            example3.display();
        } else {
            System.out.println("Marker not implemented.");
        }
    }
}
