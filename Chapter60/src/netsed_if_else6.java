

import java.util.*;
class nested_if_else6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.print("Enter the age: ");
        age = sc.nextInt();
        if(age>18){
            System.out.print("You can do voting...\n");
            if(age>21){
                System.out.println("you can drive");
            }
        }
    }
}
