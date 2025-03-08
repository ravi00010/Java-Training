package FinalTest;

abstract class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("inavlid balance");
        }
    }

    abstract void withdraw(double amount);

    public void transfer(BankAccount toAccount, double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            toAccount.deposit(amount);
            System.out.println("Transferred: " + amount + " to account " + toAccount.accountNumber);
        } else {
            System.out.println("Invalid ");
        }
    }

}

interface Transaction {
    void transfer(BankAccount tAccount, double amount);
}

class SavingsAccount extends BankAccount implements Transaction {

    SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    void withdraw(double amount) {
        if (amount > 0 && balance - amount >= 500) {
            balance -= amount;
            System.out.println("Withdraawn: " + amount);
            System.out.println("New Balance:" + balance);
        } else {
            System.out.println("invalid");
        }
    }

    public void transfer(BankAccount tAccount, double amount) {
        if (amount > 0 && balance - amount >= 500) {
            balance -= amount;
            tAccount.deposit(amount);
            System.out.println("Transferred: " + amount);
        } else {
            System.out.println("Invalid ");
        }
    }
}

class CurrentAccount extends BankAccount implements Transaction {
    final double overdraftLimit = 5000;

    CurrentAccount(String acccountNumber, double balance) {
        super(acccountNumber, balance);
    }

    void withdraw(double amount) {
        if (amount > 0 && balance - amount >= -overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("Invalid ");
        }
    }

    public void transfer(BankAccount toAccount, double amount) {
        if (amount > 0 && balance - amount >= -overdraftLimit) {
            balance -= amount;
            toAccount.deposit(amount);
            System.out.println("Transferred: " + amount);
        } else {
            System.out.println("Invalid");
        }
    }
}

public class BankingSystem {
    public static void main(String[] args) {

        BankAccount savings = new SavingsAccount("SAV123", 5000);
        BankAccount current = new CurrentAccount("CUR456", 2000);
        savings.deposit(1000);
        current.withdraw(3000);

        savings.transfer(current, 1500);
        current.transfer(savings, 6000);
    }
}
