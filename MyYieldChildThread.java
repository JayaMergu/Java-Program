package com.threadexample;
/**yield:- the child thread can wait till the main thread finishes then child thread comes to work and it informs the thread scehdular, it will not work if the priority of child is greater than main then it will not work*/

class YieldMethodExample extends Thread {
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("I am in child");
			Thread.yield();// this is how it is written//---> 1
		}
			
	}
}
public class MyYieldChildThread {
	
	public static void main(String[] args) {
		YieldMethodExample t1=new YieldMethodExample();
		t1.start();
		for(int i=0;i<=5;i++) {
			System.out.println("I am in main");
		}
		
	}

}
/**
I am in main
I am in main
I am in child
I am in main
I am in main
I am in main
I am in main
I am in child
I am in child
I am in child
I am in child
I am in child

 */