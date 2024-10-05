
import java.util.*;
public class program11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

