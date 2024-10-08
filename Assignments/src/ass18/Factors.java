package ass18;

public class Factors {
    public static void main(String[] args) {
        // Check if a number is provided as a command line argument
        if (args.length != 1) {
            System.out.println("Please provide a single number as a command line argument.");
            return;
        }

        try {
            // Parse the input number from the command line argument
            int number = Integer.parseInt(args[0]);

            System.out.println("Factors of " + number + ":");
            // Find and print the factors of the number
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
}
