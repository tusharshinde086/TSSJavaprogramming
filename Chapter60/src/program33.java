
import java.util.*;
public class program33 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sum=0, num, i=1;

        System.out.print("Enter the number:");
        num = sc.nextInt();
        do{
            sum+=i;
            i++;
        }while(i<=num);

        System.out.print("Sum of nth number is: "+sum);
    }
}

