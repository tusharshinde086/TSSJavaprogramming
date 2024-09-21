package ass2b3;

import java.util.ArrayList;
import java.util.Scanner;

public class Detail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Staff> staffList = new ArrayList<>();

        System.out.print("Enter number of staff: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter 1 for FullTimeStaff, 2 for PartTimeStaff: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter address: ");
            String address = scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter department: ");
                String department = scanner.nextLine();
                System.out.print("Enter salary: ");
                double salary = scanner.nextDouble();
                staffList.add(new FullTimeStaff(name, address, department, salary));
            } else if (choice == 2) {
                System.out.print("Enter number of hours: ");
                int number_of_hours = scanner.nextInt();
                System.out.print("Enter rate per hour: ");
                double rate_per_hours = scanner.nextDouble();
                staffList.add(new PartTimeStaff(name, address, number_of_hours, rate_per_hours));
            }
        }

        System.out.println("\nFullTimeStaff Details:");
        for (Staff s : staffList) {
            if (s instanceof FullTimeStaff) {
                System.out.println(s);
            }
        }

        System.out.println("\nPartTimeStaff Details:");
        for (Staff s : staffList) {
            if (s instanceof PartTimeStaff) {
                System.out.println(s);
            }
        }

        scanner.close();
    }
}