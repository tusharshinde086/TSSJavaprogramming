package ass16;
public class MyNumber {
    private int number;

    // Parameterized constructor
    public MyNumber(int value) {
        this.number = value;
    }

    // Method to check if the number is even
    public boolean isEven() {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            try {
                // Parse the command line argument as an integer
                int value = Integer.parseInt(args[0]);
                MyNumber myNum = new MyNumber(value);

                // Check if the number is even
                if (myNum.isEven()) {
                    System.out.println(value + " is even.");
                } else {
                    System.out.println(value + " is odd.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please provide a valid integer.");
            }
        } else {
            System.out.println("Please provide a command line argument.");
        }
    }
}
