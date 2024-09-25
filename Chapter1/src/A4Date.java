import java.util.*;

public class A4Date {

        int dd;
        int mm;
        int yy;

        public A4Date(){
            this.dd = 1;
            this.mm = 1;
            this.yy = 2000;
        }
        public A4Date(int dd,int mm , int yy){
            this.dd = dd;
            this.mm = mm;
            this.yy = yy;
        }
        public void displayDate() {
            System.out.println(String.format("%02d-%02d-%02d", dd, mm, yy));
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            A4Date obj = new A4Date();

             int dd = sc.nextInt();
             int mm = sc.nextInt();
             int yy = sc.nextInt();

            A4Date obj1 = new A4Date();
            obj1.dd=dd;
            obj1.mm=mm;
            obj1.yy=yy;

            System.out.println("default date");
            obj.displayDate();
            System.out.println("parametrize date");
            obj1.displayDate();
        }
    }

