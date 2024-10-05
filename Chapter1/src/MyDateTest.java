import java.util.Scanner;

    class InvalidDateException extends Exception {
        InvalidDateException(String message) {
            super(message);
        }
    }

    class MyDate {
        private int day;
        private int month;
        private int year;

        void acceptDate() throws InvalidDateException {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter date as dd mm yyyy: ");
            day = scanner.nextInt();
            month = scanner.nextInt();
            year = scanner.nextInt();

            if (!isValidDate(day, month, year)) {
                throw new InvalidDateException("Invalid date: " + day + "/" + month + "/" + year);
            }
        }

        boolean isValidDate(int day, int month, int year) {
            if (month < 1 || month > 12) return false;
            if (day < 1 || day > getMaxDaysInMonth(month, year)) return false;
            return true;
        }

        int getMaxDaysInMonth(int month, int year) {
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    return 31;
                case 4: case 6: case 9: case 11:
                    return 30;
                case 2:
                    return (isLeapYear(year)) ? 29 : 28;
                default:
                    return 0; // Should never reach here
            }
        }

        boolean isLeapYear(int year) {
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }

        void displayDate() {
            System.out.println("Date: " + day + "/" + month + "/" + year);
        }
    }

    public class MyDateTest {
        public static void main(String[] args) {
            MyDate date = new MyDate();
            try {
                date.acceptDate();
                date.displayDate();
            } catch (InvalidDateException e) {
                System.out.println(e.getMessage());
            }
        }
    }
