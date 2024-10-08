package ass19;

import java.util.Scanner;

abstract class Order {
    protected int id;
    protected String description;

    // Abstract methods to be implemented in subclass
    abstract void accept();
    abstract void display();
}

class PurchaseOrder extends Order {
    private String customerName;
    private Scanner scanner = new Scanner(System.in);

    // Method to accept details of the purchase order
    @Override
    void accept() {
        System.out.print("Enter Order ID: ");
        id = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter Order Description: ");
        description = scanner.nextLine();

        System.out.print("Enter Customer Name: ");
        customerName = scanner.nextLine();
    }

    // Method to display details of the purchase order
    @Override
    void display() {
        System.out.println("Order ID: " + id);
        System.out.println("Order Description: " + description);
        System.out.println("Customer Name: " + customerName);
    }
}

public class MainOrder {
    public static void main(String[] args) {
        PurchaseOrder[] orders = new PurchaseOrder[3];

        // Create and accept details for 3 purchase orders
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Purchase Order " + (i + 1) + ":");
            orders[i] = new PurchaseOrder();
            orders[i].accept();
            System.out.println();
        }

        // Display details of the purchase orders
        System.out.println("Details of Purchase Orders:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Purchase Order " + (i + 1) + ":");
            orders[i].display();
            System.out.println();
        }
    }
}
