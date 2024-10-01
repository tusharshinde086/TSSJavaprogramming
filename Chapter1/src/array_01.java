import java.util.*;
public class array_01 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //array declaration
        int arr[]= new int[5];
        //entering array element 
        for(int i=0; i<arr.length;i++){
            System.out.println("Enter the array element: ");
            arr[i] = sc.nextInt();
        }

        //display array elements
        System.out.println("Array elements are:");
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
