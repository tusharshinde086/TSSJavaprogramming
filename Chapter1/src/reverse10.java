

import java.util.Scanner;
public class reverse10 {
         public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int rev= 0;
        
        for (int temp = number; temp != 0; temp /= 10) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
        }
        System.out.println("The reversed number is " + rev);
        
        scanner.close();
    }
}
