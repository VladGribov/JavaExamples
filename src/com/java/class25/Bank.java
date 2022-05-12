package com.java.class25;

public class Bank {
    int balance;
    String accNumber;
    String accName;

    void deposit(int amount){
        balance = balance + amount;
    }

    void withdraw(int amount){
        balance = balance - amount;
    }
    void displayBalance(){
        System.out.println(accName + "'s balance is = " + balance);
    }
    void changeMyVar(Bank acc){
        acc.balance = 5000;
    }
}
