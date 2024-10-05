
// A program asks the user to enter a positive number and keeps asking until the user complies.
import java.util.*;
public class program35{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num;
        
        do{
            System.out.print("Enter the positive number : ");
            num = sc.nextInt();

        }while(num<=0);

        System.out.print("Thank you for entering a positive number");
    }
}

