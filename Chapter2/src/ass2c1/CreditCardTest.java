// CreditCardTest.java
package ass2c1;

public class CreditCardTest {
    public static void main(String[] args) {
        SilverCardCustomer silverCustomer = new SilverCardCustomer("Alice", 1234578.0);
        GoldCardCustomer goldCustomer = new GoldCardCustomer("Bob", (double) 877654321.0);

        // SilverCardCustomer operations
        silverCustomer.viewCreditAmount();
        silverCustomer.useCard(20000);
        silverCustomer.viewCreditAmount();
        silverCustomer.payCredit(5000);
        silverCustomer.viewCreditAmount();
        silverCustomer.increaseLimit(3000);

        // GoldCardCustomer operations
        goldCustomer.viewCreditAmount();
        goldCustomer.useCard(60000);
        goldCustomer.viewCreditAmount();
        goldCustomer.payCredit(10000);
        goldCustomer.viewCreditAmount();
        goldCustomer.increaseLimit(4000); // first increase
        goldCustomer.increaseLimit(4000); // second increase
        goldCustomer.increaseLimit(4000); // third increase
        goldCustomer.increaseLimit(4000); // should fail
    }
}
