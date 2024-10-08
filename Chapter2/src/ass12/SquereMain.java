package ass12;

import ass12.Series.SquareSeries;

import java.util.Scanner;

public class SquereMain {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of terms (n): ");
            int n = scanner.nextInt();

            SquareSeries series = new SquareSeries();
            series.printSquareSeries(n); // Call the method to print the series

            scanner.close();
        }
    }
