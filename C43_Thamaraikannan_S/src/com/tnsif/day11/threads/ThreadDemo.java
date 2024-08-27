package com.tnsif.day11.threads;

public class ThreadDemo extends Thread{
	private int n;
	private String msg;
	
	public ThreadDemo(int n, String msg) {
		this.n = n;
		this.msg = msg;
	}
	public void run() {
		for (int i=1; i<=n; i++) {
			try {
				Thread.sleep(300);
			}catch(Exception e) {
				System.out.println("Thread interrupted :"+e.getMessage());
			}finally {
				System.out.println(msg + i +" "+Thread.currentThread().getName());
			}
		}
	}
	
}
