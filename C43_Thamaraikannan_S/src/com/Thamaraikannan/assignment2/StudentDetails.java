package com.Thamaraikannan.assignment2;

import java.util.Scanner;

public class StudentDetails {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter your Full Name with Initial: ");
        String fullName = scanner.nextLine();
        
        System.out.print("Enter your Roll Number: ");
        String rollNumber = scanner.nextLine();
        
        System.out.print("Enter your Grade: ");
        String grade = scanner.nextLine();
        
        System.out.print("Enter your Percentage: ");
        String percentage = scanner.nextLine();
        
        // Print the details in the specified format
        System.out.println("\n" + fullName);
        System.out.println(rollNumber);
        System.out.println("\t" + grade);
        System.out.println("\t" + percentage);
        
        // Close the scanner
        scanner.close();
    }
}

