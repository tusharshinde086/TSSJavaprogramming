package ass14;

interface Operation {
    double area();
    double volume();
    double PI = 3.142;
}

class Cylinder implements Operation {
    private double radius;
    private double height;

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
        System.out.println("Area of the cylinder: " + area());
        System.out.println("Volume of the cylinder: " + volume());
    }
}

 class volumecylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5.0, 10.0);
        cylinder.display();
    }
}
