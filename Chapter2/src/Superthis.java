class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    int studentId;

    Student(String name, int studentId) {
        super(name);
        this.studentId = studentId;
    }
}

public class Superthis {
    public static void main(String[] args) {
        Student student = new Student("John", 101);
        System.out.println(student.name + ", ID: " + student.studentId);
    }
}
