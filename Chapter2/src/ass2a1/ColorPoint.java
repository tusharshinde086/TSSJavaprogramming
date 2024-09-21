package ass2a1;

public class ColorPoint extends Point{
    String color;
    ColorPoint(int x,int y,String color){
        super(x,y);
        this.color=color;
    }

    void display(){
        System.out.println("x = "+ x + " y = "+y+" color = "+color);
    }
}
