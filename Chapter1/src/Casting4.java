
public class Casting4 {
	   public static void main(String[] args) {
           long bigNum = 10000000000L;
           int num = (int) bigNum;  // Error: incompatible types: possible lossy conversion from long to int
           System.out.println("Int value: " + num);
       }

}
