package ass4;

import java.util.Scanner;
public class GreetUser {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            String upperCaseName = name.toUpperCase();

            System.out.println("Hello, " + upperCaseName + ", nice to meet you!");

            scanner.close();
        }
    }
