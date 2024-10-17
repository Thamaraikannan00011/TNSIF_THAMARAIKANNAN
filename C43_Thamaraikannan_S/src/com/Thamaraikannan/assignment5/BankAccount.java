package com.Thamaraikannan.assignment5;

public class BankAccount {
    @SuppressWarnings("unused")
	private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new InvalidAmountException("Invalid deposit amount: " + amount);
        }
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= 0) {
            throw new InvalidAmountException("Invalid withdrawal amount: " + amount);
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for withdrawal: " + amount);
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

