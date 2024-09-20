public class object3 {
    int x = 20 ; 
    
    public static void main(String[] args) {
        object1 t = new object1();
        object1 s = new object1();
        s.x = t.x + 20;
       
        System.out.println("value of t.x= "+ t.x);
        System.out.println("value of s.x= "+ s.x);
        
    }

}
