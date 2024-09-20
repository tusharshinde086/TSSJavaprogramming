
class Employee {
    static String company = "TechCorp";
}

class Developer extends Employee {
    String name;

    Developer(String name) {
        this.name = name;
    }
}
public class extend1 {
    public static void main(String[] args) {
        Developer dev = new Developer("Alice");
        System.out.println(dev.name + " works at " + Employee.company);
    }
}