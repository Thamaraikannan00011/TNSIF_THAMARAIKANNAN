package com.tnsif.day10.exception;

import java.util.*;

public class ExceptionHandling {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int num1 = scanner.nextInt();
            System.out.println(num1 % 2 == 0 ? num1+" is Even" : num1+" is odd");

        } catch (Exception e) {
            System.out.println("Error: Please enter a valid integer!");

        } finally {
            System.out.println("Program execution completed.");
            scanner.close();
        }
    }

}
