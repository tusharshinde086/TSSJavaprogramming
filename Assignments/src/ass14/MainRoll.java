package ass14;

class RollNoOutOfRangeException extends Exception {
    public RollNoOutOfRangeException(String message) {
        super(message);
    }
}

class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws RollNoOutOfRangeException {
        if (rollNo < 13001 || rollNo > 13080) {
            throw new RollNoOutOfRangeException("Rollno is Not Within The Range");
        }
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class MainRoll {
    public static void main(String[] args) {
        try {
            Student student1 = new Student(13005, "Alice", 20, "Computer Science");
            student1.display();

            Student student2 = new Student(13090, "Bob", 22, "Mechanical Engineering");
            student2.display();
        } catch (RollNoOutOfRangeException e) {
            System.out.println(e.getMessage());
        }
    }
}
