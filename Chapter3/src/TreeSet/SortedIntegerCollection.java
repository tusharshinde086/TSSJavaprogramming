package TreeSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SortedIntegerCollection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> numbers = new TreeSet<>();

        System.out.print("Enter the number of integers you want to input: ");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " integers (duplicates will be ignored):");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }

        System.out.println("Elements in sorted order:");
        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.print("Enter an integer to search: ");
        int searchElement = scanner.nextInt();
        if (numbers.contains(searchElement)) {
            System.out.println(searchElement + " is present in the collection.");
        } else {
            System.out.println(searchElement + " is not present in the collection.");
        }

        scanner.close();
    }
}

