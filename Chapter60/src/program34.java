
import java.util.*;
public class program34 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String correctPass = "iLoveCoding";
        String inputPass;

        do{
            System.out.print("Enter password: ");
            inputPass = sc.nextLine();
        }while(!inputPass.equals(correctPass));

        System.out.print("Welcome \n Access granted..");
    }
}

