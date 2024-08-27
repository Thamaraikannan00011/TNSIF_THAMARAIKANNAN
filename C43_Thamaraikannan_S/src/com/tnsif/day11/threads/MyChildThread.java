package com.tnsif.day11.threads;

public class MyChildThread extends Thread{
	@Override 
	public void run() {
		System.out.println("inside run() thread is alive"+"or not?"+this.isAlive());
		int n0 = 0;
		while(n0>4) {
			n0++;
			System.out.println("number = "+n0);
			try {
				sleep(500);
			}catch(Exception exp) {
				System.err.println();
			}
		}
	}
}
