interface MathOperations {
    static int add(int a, int b) {
        return a + b;
    }
}

class Interfacemath6 {
    public static void main(String[] args) {
        int result = MathOperations.add(10, 20);
        System.out.println("Sum is : " + result);
    }
}

