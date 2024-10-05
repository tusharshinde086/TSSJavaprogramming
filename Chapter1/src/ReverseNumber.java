public class ReverseNumber {
        public static void main(String[] args) {
            if (args.length != 1) {
                System.out.println("Please provide a single number as a command line argument.");
                return;
            }

            try {
                int number = Integer.parseInt(args[0]);
                int reversed = 0;

                while (number != 0) {
                    int digit = number % 10;
                    reversed = reversed * 10 + digit;
                    number /= 10;
                }

                System.out.println("Reversed Number: " + reversed);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
    }

