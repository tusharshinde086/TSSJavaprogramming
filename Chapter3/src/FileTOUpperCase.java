package ass18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileTOUpperCase {
    public static void main(String[] args) {
        // File path to read
        String filePath = "abc.txt";

        // Try-with-resources to automatically close the file reader
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Reading the file line by line
            while ((line = reader.readLine()) != null) {
                // Display the line in uppercase
                System.out.println(line.toUpperCase());
            }
        } catch (IOException e) {
            // Handle any file-related exceptions
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
