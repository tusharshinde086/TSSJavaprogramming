import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept the number of elements (n)
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Create an array to store 'n' elements
        int[] numbers = new int[n];

        // Read 'n' elements from the user and store them in the array
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Calculate the sum of array elements
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        // Print the sum of elements
        System.out.println("Sum of the elements in the array: " + sum);

        // Close the scanner
        scanner.close();
    }
}
