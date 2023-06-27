package demo1.oops.excercise7;

import java.util.ArrayList;

public class BankMain7 {
    public static void main(String[] args){
        Account account1 = new Account("Peter Irmgard", "C0011C", 5000);
        Account account2 = new Account("Katja Ruedi", "C0121", 4500);
        Account account3 = new Account("Marcella Gebhard", "C0222", 20000);

        Bank bank = new Bank();
        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);

        ArrayList<Account> accounts = bank.getAccounts();

        for (Account account: accounts){
            System.out.println(account.getAccountInfo());
        }

        System.out.println("--------------------------------------------");
        System.out.println("After depositinhg 1000 into account1 : ");
        bank.depositMoney(account1, 1000);
        System.out.println(account1.getAccountInfo());

        System.out.println("--------------------------------------------");
        System.out.println("No transaction in account2: ");
        System.out.println(account2.getAccountInfo());

        System.out.println("--------------------------------------------");
        System.out.println("After withdrawing 5000 from account3: ");
        bank.withdrawMoney(account3, 5000);
        System.out.println(account3.getAccountInfo());

    }
}
