import java.io.*;
public class BufferReader_02 {
    public static void main(String args[]) throws IOException{
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        InputStreamReader io = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(io);

        System.out.println("Enter your name:-");
        String str = br.readLine();
        System.out.println("your name is "+str);
    }
}
