/**Let’s take the example of odd and even. If a number is even, we also need to check whether the number is divisible by 6. And if the number is odd, we need to check whether the number is divisible by 3. Here, a single if-else statement won’t be able to solve the problem. Therefore, we need to use nested if-else statements.
 */
import java.util.*;
public class nested_if_else {
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
