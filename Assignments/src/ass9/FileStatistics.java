package ass9;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileStatistics {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java FileStatistics <filename>");
            return;
        }

        String fileName = args[0];
        int characterCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++;
                characterCount += line.length();
                String[] words = line.trim().split("\\s+"); // Split on whitespace
                wordCount += words.length;
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
            return;
        }

        System.out.println("Number of characters: " + characterCount);
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of lines: " + lineCount);
    }
}
