package com.Thamaraikannan.assignment5;

public class BankingSystem {
    public static void main(String[] args) {
        try {
            BankAccount account = new BankAccount(12345, 1000.0);

            account.deposit(500.0);

            account.withdraw(200.0);

            account.withdraw(900.0);
        } catch (InvalidAmountException | InsufficientFundsException e) {
            System.err.println("Exception occurred: " + e.getMessage());
        }
    }
}

