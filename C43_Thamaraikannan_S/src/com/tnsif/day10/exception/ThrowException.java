package com.tnsif.day10.exception;

public class ThrowException {
	public void demo(){
		int a = 5/0;
		System.out.println(a);
	}
	public void show(){
		try {
			demo();
		}
		catch(Exception e) {
			System.out.println("Exception---->"+e);
		}
		finally {
			System.out.println("Hello World !!!");
		}
	}

}
