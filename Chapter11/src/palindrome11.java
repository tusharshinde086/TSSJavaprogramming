

public class palindrome11 {
        public static void main(String[] args) {
            int number = 12321; 
            int Number = number;
            int rev = 0;
            
            while (number != 0) {
                int digit = number % 10;
                rev = rev * 10 + digit;
                number /= 10;
            }
    
            if (Number == rev) {
                System.out.println(Number + " is a palindrome.");
            } else {
                System.out.println(Number + " is not a palindrome.");
            }
        }
    }
    
