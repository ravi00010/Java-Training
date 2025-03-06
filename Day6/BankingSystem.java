package Day6;

public class BankingSystem {
    String accountHolder;
    int accountNumber;
    double balance;

    BankingSystem(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void show() {
        System.out.println("Acoount Holder: " + accountHolder + "\n" + "Account Number " + accountNumber + "\n"
                + "Current Balance " + balance);
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("New balance: " + balance);

        } else {
            System.out.println("Invalid amount");
        }
    }

    void withdrawal(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("New balance: " + balance);
        } else {
            System.out.println("Invalid amount");
        }
    }

    public static void main(String[] args) {
        BankingSystem obj = new BankingSystem("Sharmila", 123, 5000.0);
        obj.show();
        obj.deposit(1500);
        obj.withdrawal(2000);
    }
}
