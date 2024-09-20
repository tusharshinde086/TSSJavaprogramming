package assignment1;
import java.io.*;

class MultiplicationTable {
        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter a number: ");
            int number = Integer.parseInt(reader.readLine());
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
        }
    }


