package com.throwexample;
class Example implements Runnable{
	public void run(){
		System.out.println("hello");
	}
}

public class MyRunnable {

	public static void main(String[] args) { // main thread is created
	Example e=new Example();
	Thread t1=new Thread(e);// thread is created in thread class
	t1.start();//start method to run method
	for(int i=0;i<=5;i++) {
		System.out.println(i);
		}
	}
}
