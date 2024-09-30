package ass20;
import java.util.Arrays;

public class arraysort {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Please provide at least 3 numbers.");
            return;
        }

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);

        int[] numbers = {num1, num2, num3};
        Arrays.sort(numbers);

        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
