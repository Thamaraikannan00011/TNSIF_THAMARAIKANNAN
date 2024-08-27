package com.tnsif.day9.WrapperClass;

public class Wrapperclass {
	public static void main(String[] args) {
		// Unboxing - converting explicitly.
		Integer i = new Integer(10);
		System.out.println(i);
		int b = i.intValue();//intValue is an method integer can be collected to int.
		b+=5;
		System.out.println(b);
		
		//without using intValue
		int c = i;
		c-=2;
		System.out.println(c);
		
		//autoboxing - converting implicity
		int a = 100;
		Integer I = a;
		System.out.println(I);
		
	}
	

}
