package ass20;

import java.util.Scanner;

public class ArithmaticOperator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            System.out.print("Enter operation (multiply/divide): ");
            String operation = scanner.next().toLowerCase();

            double result = 0;
            boolean validOperation = true;

            if (operation.equals("multiply")) {
                result = num1 * num2;
            } else if (operation.equals("divide")) {
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperation = false;
                }
            } else {
                System.out.println("Error: Invalid operation. Please enter 'multiply' or 'divide'.");
                validOperation = false;
            }

            if (validOperation) {
                System.out.println("Result: " + result);
            }

            scanner.close();
        }
    }

