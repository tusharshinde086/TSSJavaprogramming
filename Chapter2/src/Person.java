package InheritanceInterface;

public class Person {
    void speak() {
        System.out.println("Person speaks");
    }
}

class Teacher extends Person {
    void speak() {
        super.speak(); // Calling parent's speak
        System.out.println("Teacher teaches");
    }
}

class MethodOverridingExample {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.speak();}
}
