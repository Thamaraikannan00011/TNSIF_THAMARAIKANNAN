package com.tnsif.day7.polymorphism;

class parent{
	void print() {
		System.out.println("parent");
	}
}
//derived class 1
class child1 extends parent{
	void print() {//here, print act as method for child1.
		System.out.println("This is an 1nd class derived from parent : child 1");
	}
}
//derived class 2
class child2 extends parent{
	void print() {//here, print act as method for child2.
		System.out.println("This is an 2nd class derived from parent : child 2");
	}
}
public class overriding {

	public static void main(String[] args) {
		parent a;// a is an object
		a = new child1();// calling the function
		a.print();
		a= new child2();
		a.print();
		}

}
