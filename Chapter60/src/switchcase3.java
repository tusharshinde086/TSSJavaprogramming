
import java.util.*;
class program_switchCase_02 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String rank;
        System.out.println("----------NCC department access portal----------");
        System.out.println("(Rank should be in capital letters and short form)");
        System.out.print("Enter your Rank:");
        rank = sc.nextLine();

        switch(rank){
            case "CDT":{
                System.out.print("Access granted");
                break;
            }
            case "LDG CDT":{
                System.out.print("Access granted");
                break;
            }
            case "PO":{
                System.out.print("Access granted");
                break;
            }
            case "ANO":{
                System.out.print("Access granted");
                break;
            }
            default:{
                System.out.print("Access denined");
            }
        }
    }

}