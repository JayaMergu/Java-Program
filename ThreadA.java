package com.threadexample;
class ThreadB extends Thread{
	int total=0;
	public void run() {
		synchronized(this) {// one thread is in the process then other thread cannot access it
			for(int i=0;i<=5;i++) {
				total=total+i;
			}
			System.out.println("this child thrad is giving notofication");//simple message to understand
			this.notify();// this is used to notify the thread
		}
	}
}

public class ThreadA {

	public static void main(String[] args) throws InterruptedException {// main thread
		ThreadB b=new ThreadB();// creating child thread
		b.start();//calling start function 
		synchronized(b) {
			b.wait();//wait method from thread is to tell the thread to wait
			System.out.println("Main thrad got the notofication");//msg to understand
			System.out.println(b.total);
		}

	}

}
