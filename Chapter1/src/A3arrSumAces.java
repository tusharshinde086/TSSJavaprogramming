import java.util.Arrays;

public class A3arrSumAces {

        public static void main(String[] args) {
            int[] array = {5, 2, 8, 1, 3};

            int sum = 0;
            for (int num : array) {
                sum += num;
            }

            Arrays.sort(array);

            System.out.println("Sum of array elements: " + sum);
            System.out.print("Array elements in ascending order: ");
            for (int num : array) {
                System.out.print(num + " ");
            }
        }
    }


