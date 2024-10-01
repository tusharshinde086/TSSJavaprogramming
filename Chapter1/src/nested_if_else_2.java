//Check if three numbers are equal or not
public class nested_if_else_2 {
    public static void main(String args[]){
        int a=5, b=5, c=5;
        if(a==b){
            if(b==c){
                System.out.print("Equal");
            }
            else{
                System.out.print("Not Equal");
            }
        }
        else{
            System.out.print("Not Equal");
        }
    }
}
