package com.tnsif.day8.Interface;

interface one{
	/*only abstract method.
	will have default public abstract.*/
	int age = 19;//final & Static
	void show ();
}

class two implements one{
	@Override 
	public void show() {
		System.out.println("interface method one is implemented to two");
	}
}

public class interfaceProgram {

	public static void main(String[] args) {
		two t = new two();
		t.show();
	}

}
