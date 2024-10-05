import java.util.*;
public class program32 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i=1, number;
        System.out.print("Enter the number:");
        number = sc.nextInt();
        do{
            System.out.println(number*i);
            i++;
        }while(i<=10);
    }
}
