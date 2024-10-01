package InheritanceInterface;

public class Person2 {
    Person() {
        System.out.println("Person created");
    }

    Person(String name) {
        System.out.println("Person created with name: " + name);
    }
}

class Student extends Person {
    Student(String name) {
        super(name);
    }
}

class ConstructorInheritanceExample {
    public static void main(String[] args) {
        Student student = new Student("John");
    }

}
