package ass2;

 class MyNumber {

        // Private integer data member
        private int number;

        // Default constructor initializing number to 0
        MyNumber() {
            number = 0;
        }

        // Parameterized constructor to initialize number to a given value
        MyNumber(int number) {
            this.number = number;
        }

        // Method to check if the number is negative
        boolean isNegative() {
            return number < 0;
        }

        // Method to check if the number is positive
        boolean isPositive() {
            return number > 0;
        }

        // Method to check if the number is odd
        boolean isOdd() {
            return number % 2 != 0;
        }

        // Method to check if the number is even
        boolean isEven() {
            return number % 2 == 0;
        }


        public static void main(String[] args) {
            // Check if the user has provided a command line argument
            if (args.length > 0) {
                try {
                    // Parse the command line argument to an integer
                    int value = Integer.parseInt(args[0]);

                    // Create an instance of MyNumber with the given value
                    MyNumber myNumber = new MyNumber(value);

                    // Display the number and its properties
                    System.out.println("Number: " + value);
                    System.out.println("Is Negative: " + myNumber.isNegative());
                    System.out.println("Is Positive: " + myNumber.isPositive());
                    System.out.println("Is Odd: " + myNumber.isOdd());
                    System.out.println("Is Even: " + myNumber.isEven());

                } catch (NumberFormatException e) {
                    System.out.println("Invalid input! Please provide a valid integer as a command line argument.");
                }
            } else {
                System.out.println("Please provide a command line argument to test the program.");
            }
        }
    }

