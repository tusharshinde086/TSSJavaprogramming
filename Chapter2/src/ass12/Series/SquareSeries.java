package ass12.Series;

public class SquareSeries {
        public void printSquareSeries(int n) {
            System.out.print("Square series of first " + n + " terms: ");
            for (int i = 1; i <= n; i++) {
                System.out.print((i * i) + " "); // Printing the square of each number
            }
            System.out.println();
        }
    }
