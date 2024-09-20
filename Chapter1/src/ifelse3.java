
import java.util.*;
public class ifelse3 {
        public static void main(String args[]){
            int age;
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter your age: ");
            age = sc.nextInt();

            if(age>=18){
                System.out.print("you can drive");
            }
            else{
                System.out.print("you can not drive");
            }
        }
    }

