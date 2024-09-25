
    import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

    public class ass1a1 {
        public static void main(String[] args) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
                System.out.print("Enter a number: ");
                String input = reader.readLine();
                int number = Integer.parseInt(input);

                System.out.println("Multiplication Table of " + number + ":");
                for (int i = 1; i <= 10; i++) {
                    System.out.println(number + " x " + i + " = " + (number * i));
                }
            } catch (IOException e) {
                System.out.println("Error reading input.");
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer.");
            }
        }
    }


