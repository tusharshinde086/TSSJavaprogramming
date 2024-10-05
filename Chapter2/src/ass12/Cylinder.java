package ass12;

class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double area() {
        return 2 * Math.PI * radius * (radius + height); // Surface area formula
    }

    @Override
    double volume() {
        return Math.PI * radius * radius * height; // Volume formula
    }
}
