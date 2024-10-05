package ass5;

import java.util.Scanner;

    // Custom Exception class
    class ZeroNumberException extends Exception {
        ZeroNumberException(String message) {
            super(message);
        }
    }
public class FactorialCalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            try {
                if (number == 0) {
                    throw new ZeroNumberException("Number is 0");
                } else {
                    System.out.println("Factorial of " + number + " is: " + factorial(number));
                }
            } catch (ZeroNumberException e) {
                System.out.println(e.getMessage());
            }

            scanner.close();
        }

        static long factorial(int n) {
            long fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            return fact;
        }
    }
