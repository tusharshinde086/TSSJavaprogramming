package ass11;

    abstract class Shape {
        abstract double area();   // Method to calculate area
        abstract double volume(); // Method to calculate volume
    }

    class Sphere extends Shape {
        private double radius;

        // Constructor to initialize radius
        public Sphere(double radius) {
            this.radius = radius;
        }

        @Override
        double area() {
            return 4 * Math.PI * radius * radius; // Area of the sphere: 4πr²
        }

        @Override
        double volume() {
            return (4.0 / 3.0) * Math.PI * radius * radius * radius; // Volume of the sphere: (4/3)πr³
        }
    }
public class SphereArea {
        public static void main(String[] args) {
            double radius = 5.0; // Example radius
            Sphere sphere = new Sphere(radius);

            System.out.printf("Area of the sphere: %.2f%n", sphere.area());
            System.out.printf("Volume of the sphere: %.2f%n", sphere.volume());
        }
    }
