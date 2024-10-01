
    import java.util.Scanner;
    public class While_Factorial1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int factorial = 1;
        int i = 1;
        while (i <= n) {
            factorial *= i;
            i++;
        }
        System.out.println("Factorial: " + factorial);
        scanner.close();
    }
}


