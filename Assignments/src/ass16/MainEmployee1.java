package ass16;

class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Programmer extends Employee {
    private String proglanguage;


    public Programmer(String name, double salary, String proglanguage) {
        super(name, salary);
        this.proglanguage = proglanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + proglanguage);
    }
}

public class MainEmployee1 {
    public static void main(String[] args) {

        Programmer programmer = new Programmer("Alice", 75000, "Java");

        programmer.displayDetails();
    }
}

