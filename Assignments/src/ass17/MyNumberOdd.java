package ass17;

public class MyNumberOdd {
    private int number;

    public MyNumberOdd(int value) {
        this.number = value;
    }
    public boolean isOdd() {
        return number % 2 != 0;
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            try {
                int value = Integer.parseInt(args[0]);
                MyNumberOdd myNum = new MyNumberOdd(value);

                if (myNum.isOdd()) {
                    System.out.println(value + " is odd.");
                } else {
                    System.out.println(value + " is even.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please provide a valid integer.");
            }
        } else {
            System.out.println("Please provide a command line argument.");
        }
    }
}

