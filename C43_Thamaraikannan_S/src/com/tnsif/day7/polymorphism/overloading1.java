package com.tnsif.day7.polymorphism;

//same function name and different parameters.
class helper1{
	static final int multiply(int a, int b) {
		return a*b;
	}
	static final int multiply(int a, int b, int c) {
		return a*b*c;
	}
}


public class overloading1 {

	public static void main(String[] args) {
		System.out.println("The multiple of two numbers :"+helper1.multiply(3, 5));
		System.out.println("The multiple of three numbers :"+helper1.multiply(1, 5, 6));
	}

}
