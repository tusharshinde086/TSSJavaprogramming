package chapter2;

public class inheritance1 {
   int tt = 110;
}
class subclass1 extends inheritance1{
   int tt = 210;
   void display(){
       System.out.println("super class x =" + super.tt);
       System.out.println("sub class tt "+ tt);
    }
}
class SuperMain{
    public static void main(String[] args){
        subclass1 obj = new subclass1();
        obj.display();
    }
}