package com.BankingSystem.Group1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankingSystemApp {
    private static List<Customer> customers = new ArrayList<>();
    private static List<Account> accounts = new ArrayList<>();
    private static List<Transaction> transactions = new ArrayList<>();
    private static List<Beneficiary> beneficiaries = new ArrayList<>();
    private static int customerIDCounter = 1;
    private static int accountIDCounter = 1;
    private static int transactionIDCounter = 1;
    private static int beneficiaryIDCounter = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Banking System Menu:");
            System.out.println("1. Add Customer");
            System.out.println("2. Create Account");
            System.out.println("3. Perform Transaction");
            System.out.println("4. Add Beneficiary");
            System.out.println("5. Display All Customers");
            System.out.println("6. Display All Accounts");
            System.out.println("7. Display All Transactions");
            System.out.println("8. Display All Beneficiaries");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addCustomer(scanner);
                    break;
                case 2:
                    createAccount(scanner);
                    break;
                case 3:
                    performTransaction(scanner);
                    break;
                case 4:
                    addBeneficiary(scanner);
                    break;
                case 5:
                    displayAllCustomers();
                    break;
                case 6:
                    displayAllAccounts();
                    break;
                case 7:
                    displayAllTransactions();
                    break;
                case 8:
                    displayAllBeneficiaries();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 0);

        scanner.close();
    }

    private static void addCustomer(Scanner scanner) {
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Address: ");
        String address = scanner.nextLine();
        System.out.print("Enter Contact: ");
        String contact = scanner.nextLine();

        Customer customer = new Customer(customerIDCounter++, name, address, contact);
        customers.add(customer);
        System.out.println("Customer added: " + customer);
    }

    private static void createAccount(Scanner scanner) {
        System.out.print("Enter Customer ID: ");
        int customerID = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Account Type: ");
        String type = scanner.nextLine();
        System.out.print("Enter Initial Balance: ");
        double balance = scanner.nextDouble();

        Account account = new Account(accountIDCounter++, customerID, type, balance);
        accounts.add(account);
        System.out.println("Account created: " + account);
    }

    private static void performTransaction(Scanner scanner) {
        System.out.print("Enter Account ID: ");
        int accountID = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Transaction Type (Deposit/Withdraw/Transfer): ");
        String type = scanner.nextLine();
        System.out.print("Enter Amount: ");
        double amount = scanner.nextDouble();

        Transaction transaction = new Transaction(transactionIDCounter++, accountID, type, amount);
        transactions.add(transaction);
        System.out.println("Transaction recorded: " + transaction);
    }

    private static void addBeneficiary(Scanner scanner) {
        System.out.print("Enter Customer ID: ");
        int customerID = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Beneficiary Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter Bank Details: ");
        String bankDetails = scanner.nextLine();

        Beneficiary beneficiary = new Beneficiary(beneficiaryIDCounter++, customerID, name, accountNumber, bankDetails);
        beneficiaries.add(beneficiary);
        System.out.println("Beneficiary added: " + beneficiary);
    }

    private static void displayAllCustomers() {
        System.out.println("All Customers:");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    private static void displayAllAccounts() {
        System.out.println("All Accounts:");
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

    private static void displayAllTransactions() {
        System.out.println("All Transactions:");
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }

    private static void displayAllBeneficiaries() {
        System.out.println("All Beneficiaries:");
        for (Beneficiary beneficiary : beneficiaries) {
            System.out.println(beneficiary);
        }
    }
}
