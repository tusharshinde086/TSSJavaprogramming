import java.util.*;

public class input4 {

  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read a float number
        Float floatNumber = scanner.nextFloat();
        System.out.println("Float number: " + floatNumber);
        
        // Read an integer
        int integerNumber = scanner.nextInt();
        System.out.println("Integer number: " + integerNumber);
        
        // Read a double number
        Double doubleNumber = scanner.nextDouble();
        System.out.println("Double number: " + doubleNumber);
        
        // Read a single word string
        String stringValue = scanner.next();
        System.out.println("String value: " + stringValue);
        
        // Read a byte
        byte byteValue = scanner.nextByte();
        System.out.println("Byte value: " + byteValue);
        
        // Read a short
        short shortValue = scanner.nextShort();
        System.out.println("Short value: " + shortValue);
        
        // Read a long
        long longValue = scanner.nextLong();
        System.out.println("Long value: " + longValue);
        
        // Read a boolean
        boolean booleanValue = scanner.nextBoolean();
        System.out.println("Boolean value: " + booleanValue);
        
        scanner.close();
    }
}

