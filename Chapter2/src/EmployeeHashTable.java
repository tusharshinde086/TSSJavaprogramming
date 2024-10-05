import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeHashTable {
    public static void main(String[] args) {
        HashMap<String, Double> employeeTable = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();  // Consume newline

            employeeTable.put(name, salary);
        }

        System.out.println("\nEmployee details in the hash table:");
        for (Map.Entry<String, Double> entry : employeeTable.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Salary: " + entry.getValue());
        }

        scanner.close();
    }
}

