package ass3;


    import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

    class Account {
        int accno;
        String accname;
        double balance;

        Account(int accno, String accname, double balance) {
            this.accno = accno;
            this.accname = accname;
            this.balance = balance;
        }

        void display() {
            System.out.printf("%-10d %-20s %-10.2f%n", accno, accname, balance);
        }

        static void sortAccount(Account[] accounts) {
            Arrays.sort(accounts, new Comparator<Account>() {
                public int compare(Account a1, Account a2) {
                    return Double.compare(a1.balance, a2.balance);
                }
            });
        }
    }

public class AccountTest {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of accounts: ");
            int n = scanner.nextInt();

            Account[] accounts = new Account[n];

            for (int i = 0; i < n; i++) {
                System.out.println("Enter details for Account " + (i + 1) + ":");
                System.out.print("Account Number: ");
                int accno = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Account Name: ");
                String accname = scanner.nextLine();

                System.out.print("Balance: ");
                double balance = scanner.nextDouble();

                accounts[i] = new Account(accno, accname, balance);
            }

            Account.sortAccount(accounts);

            System.out.println("\nAccount Details in Sorted Order (by Balance):");
            System.out.printf("%-10s %-20s %-10s%n", "AccNo", "AccName", "Balance");
            System.out.println("-----------------------------------------------");
            for (Account account : accounts) {
                account.display();
            }

            scanner.close();
        }
    }





/*
Enter the number of accounts: 3
Enter details for Account 1:
Account Number: 101
Account Name: Alice
Balance: 5000
Enter details for Account 2:
Account Number: 102
Account Name: Bob
Balance: 3000
Enter details for Account 3:
Account Number: 103
Account Name: Charlie
Balance: 7000

Account Details in Sorted Order (by Balance):
AccNo     AccName              Balance
-----------------------------------------------
102       Bob                  3000.00
101       Alice                5000.00
103       Charlie              7000.00
 */