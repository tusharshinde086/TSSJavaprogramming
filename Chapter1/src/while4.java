import java.util.*;

public class while4 {
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int i=1, num;
            System.out.println("Table of number");
            System.out.print("Enter the number:");
            num = sc.nextInt();
            while(i<=10){
                System.out.println(num * i);
                i++;
            }
        }
    }


