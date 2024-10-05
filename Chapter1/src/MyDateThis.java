class MyDate {
        private int dd;  // Day
        private int mm;  // Month
        private int yy;  // Year

        // Parameterized constructor
        public MyDate(int dd, int mm, int yy) {
            this.dd = dd;  // Use 'this' keyword to refer to instance variable
            this.mm = mm;  // Use 'this' keyword to refer to instance variable
            this.yy = yy;  // Use 'this' keyword to refer to instance variable
        }

        // Method to display the date in dd-mm-yy format
        public void displayDate() {
            System.out.printf("Date: %02d-%02d-%02d%n", dd, mm, yy);
        }
    }

    // Main class to test MyDate
    public class MyDateThis {
        public static void main(String[] args) {
            MyDate date = new MyDate(5, 10, 2024); // Example date
            date.displayDate();  // Display the date
        }
    }
