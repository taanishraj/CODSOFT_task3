
import java.util.Scanner;

public class main2 {
 public static void main(String[]args) {
            Bankaccount account = new Bankaccount(1000.0);
            atm atm = new atm(account);
            try (Scanner sc = new Scanner(System.in)) {
                while (true) {
                    System.out.println("**WELCOME TO ATM**");
                    System.out.println("1.DEPOSIT");
                    System.out.println("2.WITHDRAW");
                    System.out.println("3.CHECK BALANCE");
                    System.out.println("4. EXIT");
                    System.out.print("Enter the action to be performed: ");
                    int choice = sc.nextInt();
                    switch (choice) {
                        case 3 -> atm.checkbalance();
                        case 1 -> atm.deposit();
                        case 2 -> atm.withdraw();
                        case 4 -> {
                            System.out.println("Thank you for using the ATM.");
                            System.exit(0);
                        }
                        default -> System.out.println("Invalid choice. Please enter a valid option.");
                    }
                }
            }
        
        }
    }
    
