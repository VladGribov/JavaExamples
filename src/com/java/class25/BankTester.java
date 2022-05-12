package com.java.class25;

public class BankTester {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        Bank b2 = new Bank();
        b1.balance = 1000;
        b1.accNumber = "1234556789";
        b1.accName = "Vlad";
        b1.deposit(1000);
        b1.withdraw(300);
        b1.displayBalance();

        b2.deposit(1000);
        b2.displayBalance();
        int a = 10;
        b2.changeMyVar(b1);
        b1.changeMyVar(b1);
        System.out.println(b1.balance);
        System.out.println(b2.balance);
    }
}
