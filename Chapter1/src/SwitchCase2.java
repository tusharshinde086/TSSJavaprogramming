import java.util.Scanner;

public class SwitchCase2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a day of the week (e.g., Monday): ");
        String day = sc.next();

        switch (day.toLowerCase()) {
            case "monday":
                System.out.println("It's the start of the workweek!");
                break;
            case "tuesday":
                System.out.println("Second day of the week.");
                break;
            case "wednesday":
                System.out.println("Middle of the week.");
                break;
            case "thursday":
                System.out.println("Almost Friday!");
                break;
            case "friday":
                System.out.println("It's Friday, the weekend is near.");
                break;
            case "saturday":
            case "sunday":
                System.out.println("It's the weekend! Enjoy your time.");
                break;
            default:
                System.out.println("Invalid day entered.");
        }

        sc.close();
    }
}

