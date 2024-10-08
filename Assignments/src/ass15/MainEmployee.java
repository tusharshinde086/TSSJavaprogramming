package ass15;

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

class Developer extends Employee {
    private String projectName;

    public Developer(String name, double salary, String projectName) {
        super(name, salary);
        this.projectName = projectName;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Project Name: " + projectName);
    }
}

public class MainEmployee {
    public static void main(String[] args) {
        Developer developer = new Developer("Alice", 75000, "AI Project");
        developer.displayDetails();
    }
}
