package InheritanceInterface;

interface MathOperation {
    int operate(int a, int b);
}

class Addition implements MathOperation {
    public int operate(int a, int b) {
        return a + b;
    }
}

class Interface13 {
    public static void main(String[] args) {
        MathOperation addition = new Addition();
        int result = addition.operate(10, 5);
        System.out.println("Result: " + result);
    }
}

