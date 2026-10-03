import java.util.ArrayList;
import java.util.Scanner;

// Account class
class Account {

    private String accountNumber;
    private String customerName;
    private double balance;

    // Constructor
    Account(String accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;

        if (balance > 0) {
            this.balance = balance;
        } else {
            this.balance = 1;
            System.out.println("Initial balance must be greater than 0.");
        }
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
            System.out.println("Current balance: " + balance);
        } else {
            System.out.println("Deposit amount must be greater than 0.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than 0.");
        } else if (balance - amount <= 0) {
            System.out.println("Withdrawal denied.");
            System.out.println("Balance cannot become zero or negative.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful.");
            System.out.println("Current balance: " + balance);
        }
    }

    // Display account information
    public void displayAccount() {
        System.out.println("\nAccount Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Balance: " + balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}


// Bank class
class Bank {

    private ArrayList<Account> accounts = new ArrayList<>();

    // Add account
    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added successfully.");
    }

    // Remove account
    public void removeAccount(String accountNumber) {

        Account account = findAccount(accountNumber);

        if (account != null) {
            accounts.remove(account);
            System.out.println("Account removed successfully.");
        } else {
            System.out.println("Account not found.");
        }
    }

    // Find account
    public Account findAccount(String accountNumber) {

        for (Account account : accounts) {

            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }

        return null;
    }
}


// Main ATM class
public class BankATM {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Bank bank = new Bank();

        // Sample accounts
        bank.addAccount(new Account("101", "Jahid", 5000));
        bank.addAccount(new Account("102", "Rahim", 3000));

        while (true) {

            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Add Account");
            System.out.println("2. Remove Account");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Account Information");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = input.nextInt();

            switch (choice) {

                case 1:
                    input.nextLine();

                    System.out.print("Enter account number: ");
                    String accNo = input.nextLine();

                    System.out.print("Enter customer name: ");
                    String name = input.nextLine();

                    System.out.print("Enter initial balance: ");
                    double balance = input.nextDouble();

                    bank.addAccount(
                        new Account(accNo, name, balance)
                    );
                    break;


                case 2:
                    System.out.print("Enter account number: ");
                    accNo = input.next();

                    bank.removeAccount(accNo);
                    break;


                case 3:
                    System.out.print("Enter account number: ");
                    accNo = input.next();

                    Account account = bank.findAccount(accNo);

                    if (account != null) {

                        System.out.print("Enter deposit amount: ");
                        double amount = input.nextDouble();

                        account.deposit(amount);

                    } else {
                        System.out.println("Account not found.");
                    }

                    break;


                case 4:
                    System.out.print("Enter account number: ");
                    accNo = input.next();

                    account = bank.findAccount(accNo);

                    if (account != null) {

                        System.out.print("Enter withdrawal amount: ");
                        double amount = input.nextDouble();

                        account.withdraw(amount);

                    } else {
                        System.out.println("Account not found.");
                    }

                    break;


                case 5:
                    System.out.print("Enter account number: ");
                    accNo = input.next();

                    account = bank.findAccount(accNo);

                    if (account != null) {
                        account.displayAccount();
                    } else {
                        System.out.println("Account not found.");
                    }

                    break;


                case 6:
                    System.out.println("Thank you for using the ATM.");
                    input.close();
                    return;


                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
