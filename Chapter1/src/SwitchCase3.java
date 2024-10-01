import java.util.Scanner;

enum Season {
    SPRING, SUMMER, AUTUMN, WINTER
}

public class SwitchCase3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a season (SPRING, SUMMER, AUTUMN, WINTER): ");
        String input = sc.next().toUpperCase();

        Season season;
        try {
            season = Season.valueOf(input);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid season entered.");
            return;
        }

        switch (season) {
            case SPRING:
                System.out.println("Spring: Time for flowers and mild weather.");
                break;
            case SUMMER:
                System.out.println("Summer: It's hot and sunny!");
                break;
            case AUTUMN:
                System.out.println("Autumn: Leaves are falling.");
                break;
            case WINTER:
                System.out.println("Winter: It's cold and sometimes snowy.");
                break;
            default:
                System.out.println("Unknown season.");
        }

        sc.close();
    }
}

