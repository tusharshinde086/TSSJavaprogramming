package ass12;

import java.util.Scanner;


public class VolumeAreaCylinder {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the radius of the cylinder: ");
            double radius = scanner.nextDouble();

            System.out.print("Enter the height of the cylinder: ");
            double height = scanner.nextDouble();

            Cylinder cylinder = new Cylinder(radius, height);

            System.out.printf("Surface Area of the Cylinder: %.2f%n", cylinder.area());
            System.out.printf("Volume of the Cylinder: %.2f%n", cylinder.volume());

            scanner.close();
        }
    }

