package com.Thamaraikannan.assignment6;

public class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public synchronized void withdraw(int amount, String threadName) {
        if (amount > balance) {
            System.out.println(threadName + " - Insufficient balance! Withdrawal failed.");
        } else {
            System.out.println(threadName + " - Withdrawing " + amount + " from account.");
            balance -= amount;
            System.out.println(threadName + " - Withdrawal successful. Remaining balance: " + balance);
        }
    }

    public synchronized void deposit(int amount, String threadName) {
        System.out.println(threadName + " - Depositing " + amount + " to account.");
        balance += amount;
        System.out.println(threadName + " - Deposit successful. New balance: " + balance);
    }

    public int getBalance() {
        return balance;
    }
}

