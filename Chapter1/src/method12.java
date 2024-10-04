import java.util.*;

public class method12 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        Main13.evenOdd(num);
        sc.close();
    }
}

class Main13{
    //method to check wheter the number odd or even
    public static void evenOdd(int num){
        if(num%2 == 0){
            System.out.print("is even: "+num);
        }
        else{
            System.out.print("is odd: "+num);
        }
    }
}
