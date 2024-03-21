package com.throwexample;
class MyThreadDemo extends Thread{ // extending the thread class
	public void run(){//start() //run method for the thread 
		int sum=0;// variable to store the sum of values 
		for(int i=0;i<=5;i++) {
			System.out.println("Sum=:"+sum+"+"+i);// just to print the values ofsum and i value adding 
			sum=sum+i;
			System.out.println("Sum= "+sum);//printing the sum
		}
	}
}

public class MyThread {

	public static void main(String[] args) {//main thread is created
		MyThreadDemo t1=new MyThreadDemo();// creating a child thread
		//t1.run();// method overriding run method
		t1.start();// thread starting running // start method will call run method
		for(int i=0;i<=5;i++) {// it is done by main thread 
			System.out.println("I am in class"+i);// just to make thread work  
		}

	}

}
