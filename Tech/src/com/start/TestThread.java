package com.start;

public class TestThread extends Thread {

	public void run() {
		
		if(Thread.currentThread().isDaemon()){
			System.out.println("Im A Deamon Thread");
		}
	}

	public static void main(String[] args) {
		
		TestThread test1 = new TestThread();
		
		

		test1.setDaemon(true);
		test1.start();
		
	}
}