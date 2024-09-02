package com.tnsif.day12.threadLifeCycle;

public class ThreadLifeCycle {

	public static void main(String[] args) {
		MyChildThread mythread = new MyChildThread();
		System.out.println("Before run stage THREAD isAlive or not ?"+mythread.isAlive());
		mythread.start();
		
		try {
			Thread.sleep(4000);
		}catch(Exception exp) {
			System.err.println("Thread is interrupted!"+exp);
		}
		System.out.println("After complition execution of thread, it isAlive or not ?"+mythread.isAlive());
	}

}
