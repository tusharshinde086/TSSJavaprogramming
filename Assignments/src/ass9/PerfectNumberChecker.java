package ass9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PerfectNumberChecker {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter a number: ");
            int number = Integer.parseInt(reader.readLine());
            if (isPerfect(number)) {
                System.out.println(number + " is a perfect number.");
            } else {
                System.out.println(number + " is not a perfect number.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading input.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }

    private static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number && number != 0; // Check if the sum of divisors equals the number
    }
}
