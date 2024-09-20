import java.util.Scanner;

public class while3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int total = 0;
        System.out.println("Enter 0 to stop addition");
        System.out.print("Enter the number: ");
        number = sc.nextInt();

        while (number > 0) {
            total += number;
            System.out.print("Enter the number: ");
            number = sc.nextInt();
        }
        System.out.print("Number sum is: " + total);
    }
}
