package com.tnsif.day4.AccessModifiers;

public class AccessModifiers {
	
	/*
	 * Declaring default, public, private and protected variables 
	 */
	 
	int varDefault=10;
	public int varPublic=20;
	private int varPrivate=30;
	protected int varProtected=40;
	 
	/*
	 * Declaring methods with default, public, private, protected types
	 */

	void methodDefault()
	{
		System.out.println("Default access AccessModifiers class");
		System.out.println("Default Variable : "+varDefault);
	}
	
	public void methodPublic()
	{
		System.out.println("Public access AccessModifiers class");
		System.out.println("Public Variable : "+varPublic);
	}
	
	@SuppressWarnings("unused")
	private void methodPrivate()
	{
		System.out.println("Private access AccessModifiers class");
		System.out.println("Private Variable : "+varPrivate);
	}
	
	protected void methodProtected()
	{
		System.out.println("Protected access AccessModifiers class");
		System.out.println("Protected Variable : "+varProtected);
	}

}
