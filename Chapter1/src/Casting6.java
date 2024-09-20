

public class Casting6 {
	public static void main(String[] args) {
        int num1 = 130;       //if we remove byte  check
        byte bb = (byte)num1;  // Error: incompatible types: possible lossy conversion from int to byte
        System.out.println("Byte value: " + bb);
    }

}
