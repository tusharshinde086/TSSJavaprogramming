

//nested if program to print tables below 100
import java.util.*;
 class nested_if_else9 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int table;
        System.out.print("Enter the number:");
        table = sc.nextInt();
        int tem = table;

        if(tem==table){
            if(table<100){

                for(int i=1; i<=10; i++){
                    System.out.println(table*i);
                }
            }
        }
        else{
            System.out.print("not valid number");
        }
    }
}
