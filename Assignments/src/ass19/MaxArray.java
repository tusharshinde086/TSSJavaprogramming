package ass19;

import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Create an array to store n numbers
        int[] numbers = new int[n];

        // Accept n different numbers from the user
        System.out.println("Enter " + n + " different numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Find the maximum number in the array
        int max = numbers[0];
        for (int i = 1; i < n; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Display the maximum number
        System.out.println("The maximum number is: " + max);

        scanner.close();
    }
}
