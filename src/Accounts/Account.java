package Accounts;
import java.util.Random;

public class Account {
    private double balance;
    private final String accountNumber;
    private final String accountOwner;



    public Account(double balance, String accountOwner) {
        this.balance = balance;
        this.accountOwner = accountOwner.toUpperCase();

        Random random = new Random();

        int fnum = random.nextInt(1000,9999);
        int snum = random.nextInt(1000,9999);

        accountNumber = fnum + "-" + snum;

    }

    public void checkingAccount(){
        System.out.println("Welcome to checking account, " + accountOwner+"!");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println(accountNumber);
        System.out.println("agency account");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Your balance is: R$"+ balance);
    }
    public void deposit(double amount){
        balance += amount;
        System.out.println("translation successfully");

    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void without(double amount, Account forWho){
        if (balance > amount){
            balance -= amount;
            forWho.deposit(amount);
        }else{
            System.out.println("Sorry, this translation was fail");
        }
    }
}
