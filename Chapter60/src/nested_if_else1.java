
import java.util.*;
public class nested_if_else1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Enter the number: ");
        number = sc.nextInt();
        if(number % 2 == 0){
            System.out.print("Even ");
            if(number % 6 == 0){
                System.out.print("and number is divisible by 6");
            }
            else{
                System.out.print("number is not divisible by 6");
            }
        }
        else{
            System.out.print("Odd ");
            if(number % 3 == 0){
                System.out.print("and number is divisible by 3");
            }
            else{
                System.out.print("number is not divisible by 3");
            }
        }
    }
}
