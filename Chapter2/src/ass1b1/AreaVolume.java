package ass1b1;

public class AreaVolume{
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Cylinder cylinder = new Cylinder(5.0, 10.0);

        circle.display();
        System.out.println();

        cylinder.display();
    }
}
