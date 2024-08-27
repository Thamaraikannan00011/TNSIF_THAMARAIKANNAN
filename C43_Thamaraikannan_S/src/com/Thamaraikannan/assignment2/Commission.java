package com.Thamaraikannan.assignment2;

import java.util.Scanner;

class Commission {
    private String name;
    private String address;
    private String phone;
    private double salesAmount;
    private double commission;

    public void acceptDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = scanner.nextLine();

        System.out.print("Enter Address: ");
        address = scanner.nextLine();

        System.out.print("Enter Phone: ");
        phone = scanner.nextLine();

        System.out.print("Enter Sales Amount: ");
        salesAmount = scanner.nextDouble();

        calculateCommission();
        
        scanner.close();
    }

    private void calculateCommission() {
        if (salesAmount >= 100000) {
            commission = 0.10 * salesAmount;
        } else if (salesAmount >= 50000) {
            commission = 0.05 * salesAmount;
        } else if (salesAmount >= 30000) {
            commission = 0.03 * salesAmount;
        } else {
            commission = 0;
        }
    }

    public void displayDetails() {
        System.out.println("Sales Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Sales Amount: " + salesAmount);
        System.out.println("Commission: " + commission);
    }
}

