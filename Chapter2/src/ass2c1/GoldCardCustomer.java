package ass2c1;

public class GoldCardCustomer extends SilverCardCustomer{
 int creditLimit = 100000 ;
 private int increaseLimitCount = 0;

    public GoldCardCustomer(String name, Double cardNumber) {
        super(name, cardNumber);
    }

    @Override
    public void increaseLimit(double amount) {
        if (increaseLimitCount < 3 && amount <= 5000) {
            creditLimit += amount;
            increaseLimitCount++;
            System.out.println("Limit increased by " + amount + ". New credit limit: " + creditLimit);
        } else if (increaseLimitCount >= 3) {
            System.out.println("Limit increase failed. You can increase the limit only 3 times.");
        } else {
            System.out.println("Limit increase failed. You cannot increase the limit by more than 5000.");
        }
    }
}