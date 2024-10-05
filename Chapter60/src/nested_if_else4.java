
import java.util.*;
    public class nested_if_else4 {
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int age;
            System.out.print("Enter the age : ");
            age = sc.nextInt();
            boolean isWeekend = false;
            if(age<13){
                if(isWeekend){
                    System.out.print("Movie ticket price: 100rs");
                }
                else{
                    System.out.print("Movie ticket price: 120rs");
                }
            }
            else if(age>=13 && age<=64){
                if(isWeekend){
                    System.out.print("Movie ticket price: 150rs");
                }
                else{
                    System.out.print("Movie ticket price: 180rs");
                }
            }
            else{
                if(isWeekend){
                    System.out.print("Movie ticket price: 130rs");
                }
                else{
                    System.out.print("Movie ticket price: 150rs");
                }
            }
        }
    }

