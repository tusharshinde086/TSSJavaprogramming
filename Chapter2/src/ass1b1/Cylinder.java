package ass1b1;

public class Cylinder implements Operation {
    double radius;
    double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double area() {
        return 2 * PI * radius * (radius + height);
    }

    @Override
    public double volume() {
        return PI * radius * radius * height;
    }

    public void display() {
        System.out.println("Cylinder:");
        System.out.println("Area: " + area());
        System.out.println("Volume: " + volume());
    }
}
