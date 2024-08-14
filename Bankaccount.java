
public class Bankaccount{
    private double balance;
    public Bankaccount(double initialbalance) {
        this.balance = initialbalance;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}

