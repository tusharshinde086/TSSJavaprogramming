


import java.util.Scanner;

    public class method6 {

        // Method to print name
        public static void printName(String name) {
            System.out.println("my name is " +name);
        }

        // Overloaded method to print name and age
        public static void printName(String name, int age) {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Read input for name and age
            String name = sc.next();
            int age = sc.nextInt();
            // Print name and age
            printName(name);  // Single parameter
            printName(name, age);  // Two parameters

        }
    }