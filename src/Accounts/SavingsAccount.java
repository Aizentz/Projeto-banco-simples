package Accounts;

import java.util.Random;

public class SavingsAccount extends Account{

    public SavingsAccount(double balance, String accountOwner) {
        super(balance, accountOwner);

    }

    public void updateBalance(){
        Random random = new Random();
        int months = random.nextInt(1, 12);
        double taxes = Double.parseDouble("0.0" + random.nextInt(1, 27));

        System.out.println("Welcome to Savings account,"+ getAccountOwner()+ "! we have the highers taxes in all the country!");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Your balance is -> R$"+getBalance());
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("if you invest your money in this account, our "+ taxes+"% taxes will do the hard work for you. we only need "+ months+" months for give your reward");

        double card = getBalance();
        card = card + (card * taxes * months);

        System.out.println("your reward will be R$"+ card);
    }
}
