package com.throwexample;
class MyThread1 extends Thread{
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println(currentThread().getPriority());
		}
	}
}
public class ThreadProrityExample {
	public static void main(String[] args) {
		MyThread1 t1=new MyThread1();
		t1.setPriority(8);
		MyThread1 t2=new MyThread1();
		t2.setPriority(2);
		t1.start();
		t2.start();
	}
}
