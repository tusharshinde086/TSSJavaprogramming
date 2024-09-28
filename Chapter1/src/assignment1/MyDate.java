package assignment1;

public class MyDate {
    int dd;
    int mm;
    int yy;

    public MyDate(){
        this.dd = 1;
        this.mm = 1;
        this.yy = 2000;
    }
   public MyDate(int dd,int mm , int yy){
        this.dd = dd;
        this.mm = mm;
        this.yy = yy;
    }
    public void displayDate() {
        System.out.println(String.format("%02d-%02d-%02d", dd, mm, yy));
    }
    public static void main(String[] args){
        MyDate obj = new MyDate();

        MyDate obj1 = new MyDate(11 ,01 ,2024);

        System.out.println("default date");
        obj.displayDate();
        System.out.println("parametrize date");
        obj1.displayDate();
    }
}
