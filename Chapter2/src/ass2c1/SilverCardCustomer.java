package ass2c1;

public class SilverCardCustomer implements CreaditCard {
    String name;
    double cardNumber;
    int creditAmount = 0;
    int creditLimit = 50000;

    public SilverCardCustomer(String name, Double cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
    }

    @Override
    public void viewCreditAmount() {
        System.out.println(name + ", your current credit amount is: " + creditAmount);
    }

    @Override
    public void useCard(double amount) {
        if (creditAmount + amount <= creditLimit) {
            creditAmount += amount;
            System.out.println("Transaction successful. Credit amount now: " + creditAmount);
        } else {
            System.out.println("Transaction failed. Exceeds credit limit of " + creditLimit);
        }
    }

    @Override
    public void payCredit(double amount) {
        if (creditAmount >= amount) {
            creditAmount -= amount;
            System.out.println("Payment successful. Credit amount now: " + creditAmount);
        } else {
            System.out.println("Payment failed. You cannot pay more than the current credit amount.");
        }
    }

    @Override
    public void increaseLimit(double amount) {
        System.out.println("Increase limit not allowed for SilverCardCustomer.");
    }
}