import java.util.*;
public class method2 {
    public static void printname(String name , int age){
        System.out.println("name:" + name);
        System.out.println("age:" + age);
        return;
    }
  public static void main(String[]args){
 Scanner sc=new Scanner(System.in);
 String name = sc.next();
  int age = sc.nextInt();
 printname(name,age);
  }
}