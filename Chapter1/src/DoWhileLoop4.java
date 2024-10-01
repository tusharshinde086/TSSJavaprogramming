public class DoWhileLoop4 {
    public static void main(String[] args) {
        int i = 1, sum = 0;
        do {
            sum += i;
            i++;
        } while (i <= 5);
        System.out.println("Sum: " + sum);
    }
}
