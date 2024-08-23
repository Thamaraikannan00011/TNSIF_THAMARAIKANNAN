package com.tnsif.day8.Interface;

interface parent1{
	public void show();
}
interface parent2{
	public void disp();
}

class myClass{
	public void display() {
		System.out.println("method in class");
	}
}
class child extends myClass implements parent1, parent2{
	@Override
	public void show() {
		System.out.print("hello ");
	}
	@Override
	public void disp() {
		System.out.println("world !");
	}
}
public class MultipleInterface {
	public static void main(String[] args) {
		myClass m = new myClass();
		m.display();
		child c = new child();
		c.show();
		c.disp();
	}

}
