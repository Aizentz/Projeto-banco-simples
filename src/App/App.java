package App;

import Accounts.Account;
import Accounts.SavingsAccount;

public class App {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);

        while (true){
            Account a2 = new Account(100, "miguel");
            System.out.println("Welcome to Mazen Central Bank");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.print("First, press 1 for register or 2 for end this app ->");
            int fChoice = Integer.parseInt(scanner.nextLine());
            while (fChoice < 1 || fChoice > 2){
                System.out.print("First, press 1 for register or 2 for end this app");
                fChoice = Integer.parseInt(scanner.nextLine());
            }
            if(fChoice == 1) {
                System.out.print("Sure! First, type your complete name:");
                String name = scanner.nextLine();
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                System.out.println("Now, its very important to deposit any money for movement your account;");
                System.out.print("make your deposit here -> R$");
                double balance = Double.parseDouble(scanner.nextLine());

                Account a1 = new Account(balance, name);

                System.out.println("Thanks for believe in our job! we will redirect you to Checking Account!");
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                while (true) {
                    a1.checkingAccount();
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

                    System.out.println("""
                            1-> make a deposit
                            2-> make a withdraw
                            3->Become a investor
                            4-> end your session
                            """);
                    System.out.print("What would you do now?");
                    int sChoice = Integer.parseInt(scanner.nextLine());
                    while (sChoice < 1 || sChoice > 4) {
                        System.out.print("What would you do now?");
                        sChoice = Integer.parseInt(scanner.nextLine());
                    }
                    if (sChoice == 1) {
                        while (true) {
                            System.out.print("You have choice made a deposit, how amount? ");
                            double amount = Double.parseDouble(scanner.nextLine());
                            a1.deposit(amount);
                            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                            System.out.println("""
                                    You wanna made others deposits?
                                    1-> YES
                                    2-> NO
                                    """);
                            System.out.print("-> ");
                            int yesNo = Integer.parseInt(scanner.nextLine());

                            while (yesNo < 1 || yesNo > 2) {
                                System.out.print("-> ");
                                yesNo = Integer.parseInt(scanner.nextLine());
                            }
                            if (yesNo == 2) {
                                break;
                            }
                        }


                    }
                    if (sChoice == 2) {
                        while (true) {
                            System.out.print("You have choice made a withdraw, how amount? ");
                            double amount = Double.parseDouble(scanner.nextLine());
                            a1.without(amount, a2);
                            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                            System.out.println("""
                                    You wanna made others withdraws?
                                    1-> YES
                                    2-> NO
                                    """);
                            System.out.print("-> ");
                            int yesNo = Integer.parseInt(scanner.nextLine());

                            while (yesNo < 1 || yesNo > 2) {
                                System.out.print("-> ");
                                yesNo = Integer.parseInt(scanner.nextLine());
                            }
                            if (yesNo == 2) {
                                break;
                            }
                        }

                    }
                    if (sChoice == 3) {
                        System.out.println("Congrats! You be our newest Investor!, we´ll redirect you for savings Account");
                        SavingsAccount a3 = new SavingsAccount(balance, name);
                        a3.updateBalance();


                    }
                    if (sChoice == 4) {
                        break;
                    }
                }

            }else{
                System.out.println("See you soon!");
                break;
            }



        }


    }
}
