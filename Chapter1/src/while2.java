import java.util.*;

public class while2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i=1, num;
        System.out.print("Enter the number:");
        num = sc.nextInt();
        while(i<=num){
            System.out.println(i);
            i++;
        }
    }
}
