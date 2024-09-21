package ass2a1;

public class DisplayMain{
    public static void main(String[] args) {
        Point3D obj;
        ColorPoint obj1;
        Point obj3;

            obj1 = new ColorPoint(22,32,"red");
            obj = new Point3D(32,22,55);
            obj3 = new Point(12, 21);

       obj3.display();
       obj.display();
       obj1.display();

    }
}
