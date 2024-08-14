import java.util.Scanner;
public class atm{
    public  Bankaccount useraccount;
    public  Scanner sc;
    public atm(Bankaccount account) {
        this.useraccount = account;
        this.sc = new Scanner(System.in);
    }
    public  void checkbalance() {
        double balance = useraccount.getBalance();
        System.out.println("Your current balance is: Rs." + balance);
    }
    public void deposit() {
        System.out.print("Enter the amount to deposit: Rs.");
        double amount = sc.nextDouble();
        useraccount.deposit(amount);
        System.out.println("Rs." + amount + " has been deposited into your account.");
    }

    public void withdraw() {
        System.out.print("Enter the amount to withdraw: Rs.");
        double amount = sc.nextDouble();
        boolean success = useraccount.withdraw(amount);
        if (success) {
            System.out.println("Rs." + amount + " has been withdrawn from your account.");
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }
}

