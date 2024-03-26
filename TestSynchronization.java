package com.threadexample;
class PrintTable{
	synchronized void displayTable(int n) {// synchronize is use to not allow other threads while one thread is running
		for(int i=1;i<=10;i++) {
			System.out.println(n*i);
		}
	}
}
class MyThread11 extends Thread{
	PrintTable p1;//creating object of classs and passing in constructor as parameter
	MyThread11(PrintTable p){// and passing as argument
		this.p1=p;// assigning value
	}
	public void run() {
		p1.displayTable(10);
	}
}
class MyThread12 extends Thread{
	PrintTable p2;// object creation
	MyThread12(PrintTable p){ // and passing as argument
		this.p2=p;// assigning value
	}
	public void run() {
		p2.displayTable(7);
	}
}
public class TestSynchronization {

	public static void main(String[] args) {
		PrintTable pp=new PrintTable();//creating child thread
		MyThread11 t1=new MyThread11(pp);//creating child thread
		MyThread12 t2=new MyThread12(pp);//creating child thread
		t1.start();// calling start method to run 
		t2.start();// calling start method to run 
	
	}

}
