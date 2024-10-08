package ArrayList1;

import java.util.ArrayList;
import java.util.Scanner;

public class IntegerArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter the number of integers you want to input: ");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }

        System.out.println("Elements in the ArrayList:");
        for (int number : numbers) {
            System.out.println(number);
        }

        scanner.close();
    }
}
