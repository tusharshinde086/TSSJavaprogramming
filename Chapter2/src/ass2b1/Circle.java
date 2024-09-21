package ass2b1;
public class Circle implements Operation {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * radius * radius;
    }

    @Override
    public double volume() {
        return 0;
    }

    public void display() {
        System.out.println("Circle:");
        System.out.println("Area: " + area());
        System.out.println("Volume: " + volume());
    }
}
