package com.Thamaraikannan.assignment6;

public class Main {
	public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        
        Thread t1 = new Thread(new BankTransaction(account, true, 500, "Thread 1")); 
        Thread t2 = new Thread(new BankTransaction(account, false, 700, "Thread 2")); 
        Thread t3 = new Thread(new BankTransaction(account, true, 300, "Thread 3")); 
        Thread t4 = new Thread(new BankTransaction(account, false, 400, "Thread 4")); 

        
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        
        System.out.println("Final account balance: " + account.getBalance());
    }


}
