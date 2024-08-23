package com.tnsif.day7.polymorphism;



class helper{
	
	
	static final int sum(int a, int b) {
		return a+b;
	}
	static final double sum(double a, double b) {
		return a+b;
	}
}
public class Overloading {
	public static void main(String []args) {
		System.out.println("The int sum value is :"+helper.sum(1, 3));
		System.out.println("The double sum is :"+helper.sum(1.5, 3.5));
	}
}
