package ass20;

class Employee {
    private int id;
    private String name;
    private String deptName;
    private double salary;
    private static int objectCount = 0;

    public Employee() {
        this.id = 0;
        this.name = "Vishal";
        this.deptName = "Lahane";
        this.salary = 0.0;
        objectCount++;
        displayCount();
    }

    public Employee(int id, String name, String deptName, double salary) {
        this.id = id;
        this.name = name;
        this.deptName = deptName;
        this.salary = salary;
        objectCount++;
        displayCount();
    }

    private void displayCount() {
        System.out.println("Current object count: " + objectCount);
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + deptName);
        System.out.println("Salary: " + salary);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Alice", "HR", 50000);
        emp1.displayDetails();

        Employee emp2 = new Employee(102, "Bob", "IT", 60000);
        emp2.displayDetails();

        Employee emp3 = new Employee(103, "Charlie", "Finance", 55000);
        emp3.displayDetails();

        Employee emp4 = new Employee();
        emp4.displayDetails();
    }
}
