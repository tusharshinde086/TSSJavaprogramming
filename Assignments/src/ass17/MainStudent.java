package ass17;

class Student {
    // Attributes
    private int rollno;
    private String name;

    // Static variable to keep track of object count
    private static int objectCount = 0;

    // Default constructor
    public Student() {
        this.rollno = 0;
        this.name = "Unknown";
        objectCount++;
        displayObjectCount();
    }

    // Parameterized constructor
    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
        objectCount++;
        displayObjectCount();
    }

    // Method to display object count
    public static void displayObjectCount() {
        System.out.println("Number of objects created: " + objectCount);
    }

    // Getter methods for rollno and name (optional)
    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }
}

public class MainStudent {
    public static void main(String[] args) {
        // Creating objects using parameterized constructor
        Student student1 = new Student(1, "Alice");
        Student student2 = new Student(2, "Bob");
        Student student3 = new Student(3, "Charlie");

        // You can also create objects using the default constructor
        Student student4 = new Student();
    }
}

