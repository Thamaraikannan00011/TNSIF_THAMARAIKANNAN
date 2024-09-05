package com.Thamaraikannan.assignment3;

import java.util.Scanner;

public class Airline {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        
        // Taking input
        System.out.println("Enter your choice:");
        int choice = sc.nextInt();
        System.out.println("Number of hours travel:");
        int hours = sc.nextInt();
        System.out.println("cost per hour:");
        double costPerHour = sc.nextDouble();
        
        Airfare airfare = null;

        // Based on user choice, creating the appropriate object
        switch (choice) {
            case 1:
                airfare = new AirIndia(hours, costPerHour);
                break;
            case 2:
                airfare = new KingFisher(hours, costPerHour);
                break;
            case 3:
                airfare = new Indigo(hours, costPerHour);
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        // Calculating and printing the result rounded to 2 decimal places
        System.out.printf("%.2f", airfare.calculateAmount());
    }
}

