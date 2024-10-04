package InheritanceInterface;

interface MyInterface {
    private void log(String message) {
        System.out.println("Log: " + message);
    }

    default void display(String message) {
        log(message);
        System.out.println("Displaying: " + message);
    }
}

class Interfacemethod20 implements MyInterface {


