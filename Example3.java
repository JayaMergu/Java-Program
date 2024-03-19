package com.exceptionexample;

public class Example3 {// multiple catch example

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is before the calculation");
		int a=10,b=0;
		try {
			
			int val=a/b;
			System.out.println("The output is"+val);
			
		}// all child catch should be first written then father exception at end should be written.
		catch(NullPointerException e) { // multiple catch blocks to handle// child exception
			System.out.println("The exception is fired"+e);	
		}
		catch(ArithmeticException e) {// child exception
			System.out.println("The exception is fired");	
		}
		catch(Exception e)// if we don't know the Exception // father exception
		{
			System.out.println("The exception is fired"+e);
		}
		System.out.println("After the calculation");
	}

}
