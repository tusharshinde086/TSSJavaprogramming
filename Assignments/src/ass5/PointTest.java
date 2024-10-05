package ass5;

class Point {
    int x;
    int y;

    Point() {
        this.x = 0;
        this.y = 0;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void display() {
        System.out.println("Point coordinates: (" + x + ", " + y + ")");
    }
}

class ColorPoint extends Point {
    String color;

    ColorPoint() {
        super();
        this.color = "undefined";
    }

    ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    @Override
    void display() {
        System.out.println("ColorPoint coordinates: (" + x + ", " + y + "), Color: " + color);
    }
}

public class PointTest {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(3, 4);

        ColorPoint cp1 = new ColorPoint();
        ColorPoint cp2 = new ColorPoint(5, 6, "Red");

        p1.display();
        p2.display();
        cp1.display();
        cp2.display();
    }
}

