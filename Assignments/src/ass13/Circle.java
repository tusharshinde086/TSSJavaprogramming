package ass13;

public class Circle implements Operation {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * radius * radius; // Area formula: πr²
    }

    @Override
    public double volume() {
        return 0; // Volume is not applicable for a 2D shape like a circle
    }
}
