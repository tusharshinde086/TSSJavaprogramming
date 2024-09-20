import java.util.Scanner;

public class divisibleby5 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("The number " + number + " is divisible by both 3 and 5.");
            } else if (number % 3 == 0) {
                System.out.println("The number " + number + " is divisible by 3.");
            } else if (number % 5 == 0) {
                System.out.println("The number " + number + " is divisible by 5.");
            } else {
                System.out.println("The number " + number + " is not divisible by 3 or 5.");
            }

            scanner.close();
        }
    }

