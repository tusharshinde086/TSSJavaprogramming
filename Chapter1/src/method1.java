

public class method1 {
    //user define mehtod for addition of two numbers
    int addition(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String args[]){
        method1 obj1 = new method1();

        System.out.println(obj1.addition(10, 20));
    }
}
