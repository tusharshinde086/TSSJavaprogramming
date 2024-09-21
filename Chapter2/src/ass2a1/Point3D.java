package ass2a1;

public class Point3D extends Point {
    int z;
   Point3D(int x,int y,int z){
       super(x,y);
       this.z=z;
   }
   void display(){
       System.out.println("x = "+ x + "y = "+y+"z="+z);
   }
}
