import java.util.Scanner;

    class Product {
        int id;
        String name;
        double price;

        Product(int id, String name, double price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }
    }

public class ProductTest {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter  Product numbers :");
            int n = scanner.nextInt();
            Product[] products = new Product[n];

            for (int i = 0; i < n; i++) {
                System.out.println("Enter details for Product " + (i + 1) + ":");
                System.out.print("ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();  // Consume newline

                System.out.print("Name: ");
                String name = scanner.nextLine();

                System.out.print("Price: ");
                double price = scanner.nextDouble();

                products[i] = new Product(id, name, price);
            }

            int minIndex = 0;

            for (int i = 1; i < products.length; i++) {
                if (products[i].price < products[minIndex].price) {
                    minIndex = i;
                }
            }

            System.out.println("\nProduct with the minimum price is: " + products[minIndex].name);

            scanner.close();
        }
    }

