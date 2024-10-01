//Find the tallest student among 3 students
public class nested_if_else_3 {
    public static void main(String args[]){
        int s1 = 150, s2 = 170, s3 = 180;
        if(s1>s2){
            if(s1>s3){
                System.out.print("s1 is tallest among 3 students " +s1);
            }
            else{
                System.out.print("s3 is tallest among 3 students "+s3);
            }
        }
        else{
            if(s2>s3){
                System.out.print("s2 is tallest among 3 students "+s2);
            }
            else{
                System.out.print("s3 is tallest among 3 student "+s3);
            }
        }
    }
}
