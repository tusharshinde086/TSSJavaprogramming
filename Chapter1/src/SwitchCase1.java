import java.util.Scanner;

public class SwitchCase1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Choose operation: +, -, *, /");
        char operator = sc.next().charAt(0);

        int result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Sum: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Difference: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Product: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Quotient: " + result);
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid operator.");
        }

        sc.close();
    }
}

