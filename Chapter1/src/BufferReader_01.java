import java.io.*;
public class BufferReader_01 {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name:");
        String str = br.readLine();    
        System.out.println("Your name is: "+str); 
    }
}
