package com.java8features;
interface Demo{
	public void display();
}

public class WithoutLambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo() {
			public void display() {
				//it is anonymous class which provide implementation of display method
				System.out.println("hello");
			}
		};
		d.display();
		
		
			
	}

}
