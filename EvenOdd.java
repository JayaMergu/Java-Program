package com.throwexample;
class EvenNo extends Thread{
	public void print() {
		for(int i=0;i<=20;i++) {
			if(i%2==0) {
				System.out.println("Even:"+i);
			}
		}
	}
}

public class EvenOdd {

	public static void main(String[] args) {
		EvenNo e1=new EvenNo();
		e1.print();
		for(int i=0;i<=20;i++) {
			if(i%2!=0) {
				System.out.println("odd: "+i);
			}
		}

	}

}
