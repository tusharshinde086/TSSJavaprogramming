//Movie Ticket Pricing
/**Children (under 13 years): Rs. 100 on weekdays, Rs. 120 on weekends.
Adults (13 to 64 years): Rs. 150 on weekdays, Rs. 180 on weekends.
Seniors (65 years and above): Rs. 130 on weekdays, Rs. 150 on weekends.
 */
import java.util.*;
public class nested_if_else_5 {
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
