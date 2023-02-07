package com.application;

public class MultiThreading {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		
		t1.start();
		t2.start();

	}

}

class Thread1 extends Thread{
	
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println("Thread 1 is running for "+i+" times");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Thread2 extends Thread{
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println("Thread 2 is running for "+i+" times");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}