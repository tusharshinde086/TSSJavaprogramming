interface MathOperations {
    static int add(int a, int b) {
        return a + b;
    }
}

class InterfaceExample6 {
    public static void main(String[] args) {
        int result = MathOperations.add(10, 20);
        System.out.println("Sum: " + result);
    }
}

