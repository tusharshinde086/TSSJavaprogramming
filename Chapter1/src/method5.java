import java.util.Scanner;


public class method5{


        public static void printName(String name) {
            System.out.println("my name is " +name);
        }

        // Overloaded method to print name and age
        public static void printName(String name, int age) {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
        public static void printName(String name, String clas , int id) {
            System.out.println("Name: " + name);
            System.out.println("class: " + clas);
            System.out.println("id: " + id);

        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("enter a name");
            String name = sc.next();
            System.out.println("enter a class name");
            String clas = sc.next();
            System.out.println("enter a age");
            int age = sc.nextInt();
            System.out.println("enter a id ");
            int id = sc.nextInt();
            printName(name);  // Single parameter
            printName(name, age);  // Two parameters
            printName(name, clas, id);

        }
    }

