package InheritanceInterface;

public class Person2 {
    Person2() {
        System.out.println("Person created");
    }

    Person2(String name) {
        System.out.println("Person created with name: " + name);
    }
}

class Student extends Person2 {
    Student(String name) {

        super(name);
    }
}

class ConstructorInheritanceExample {
    public static void main(String[] args) {

        Student student = new Student("John");
    }

}
