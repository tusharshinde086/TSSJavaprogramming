package ass6;

import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Salary: ");
            double salary = scanner.nextDouble();

            employees[i] = new Employee(id, name, salary);
        }

        int maxIndex = 0;

        for (int i = 1; i < employees.length; i++) {
            if (employees[i].salary > employees[maxIndex].salary) {
                maxIndex = i;
            }
        }

        System.out.println("\nEmployee with the maximum salary is: " + employees[maxIndex].name);

        scanner.close();
    }
}
