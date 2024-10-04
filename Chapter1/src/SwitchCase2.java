
import java.util.*;
 class switchCase2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter the number:");
        num = sc.nextInt();

        switch(num){
            case 1:{
                System.out.print("ONE");
                break;
            }

            case 2:{
                System.out.print("TWO");
                break;
            }

            case 3:{
                System.out.print("THREE");
                break;
            }

            default:{
                System.out.print("number is grater than THREE");
            }
        }
    }
}