class Vehicle {
    Vehicle(String brand) {
        System.out.println("Brand: " + brand);
    }
}

class Car extends Vehicle {
    Car(String brand, String model) {
        super(brand);
        System.out.println("Model: " + model);
    }
}

public class MainVehical {
   //constructor inhritance
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla");
    }
}
