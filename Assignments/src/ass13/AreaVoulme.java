package ass13;

import java.util.Scanner;

public class AreaVoulme {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();

            Circle circle = new Circle(radius);

            System.out.printf("Area of the Circle: %.2f%n", circle.area());
            System.out.printf("Volume of the Circle: %.2f (Not applicable)%n", circle.volume());

            scanner.close();
        }
    }

