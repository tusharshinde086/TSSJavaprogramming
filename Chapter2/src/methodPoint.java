class Point {
        protected int x;
        protected int y;

        // Default constructor
        public Point() {
            this.x = 0;
            this.y = 0;
        }

        // Parameterized constructor
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        // Display method for Point
        public void display() {
            System.out.println("Point coordinates: (" + x + ", " + y + ")");
        }
    }

    class Point3D extends Point {
        private int z;

        // Default constructor
        public Point3D() {
            super(); // Calls the default constructor of Point
            this.z = 0;
        }

        // Parameterized constructor
        public Point3D(int x, int y, int z) {
            super(x, y); // Calls the parameterized constructor of Point
            this.z = z;
        }

        // Display method for Point3D
        @Override
        public void display() {
            System.out.println("3D Point coordinates: (" + x + ", " + y + ", " + z + ")");
        }
    }

    // Main class to test Point and Point3D
    public class methodPoint {
        public static void main(String[] args) {
            Point point2D = new Point(3, 4);
            point2D.display();

            Point3D point3D = new Point3D(5, 6, 7);
            point3D.display();
        }
    }

