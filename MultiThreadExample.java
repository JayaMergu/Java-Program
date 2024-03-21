package com.throwexample;
class Thread1 extends Thread{
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("In Thread1 class run method"+i);
		}
	}
}
class Thread2 extends Thread{
	public void run() {
		for(int i=5;i>=0;i--) {
			System.out.println("In Thread2 class run method"+i);
		}
	}
}
public class MultiThreadExample {

	public static void main(String[] args) {// main thread creating 
		Thread1 t1=new Thread1(); // child thread creating 
		Thread2 t2=new Thread2(); // child thread creating
		t1.start();// calling start method will run the method 
		t2.start();// calling start method will run the method 
		for(int i=0;i<=5;i++) {
			System.out.println("In main class"+i);
		}
	}

}
