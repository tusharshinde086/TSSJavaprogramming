package InheritanceInterface;

interface Vehicle {
    void drive();
}

class Interfacevehicle15 {
    public static void main(String[] args) {
        Vehicle car = new Vehicle() {
            public void drive() {
                System.out.println("Car is driving");
            }
        };
        car.drive();
    }
}

