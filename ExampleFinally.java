package com.exceptionexample;

public class ExampleFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is before the calculation");
		int a=10,b=0;
		try {
			
			int val=a/b;
			System.out.println("The output is"+val);
			
		}// all child catch should be first written then father exception at end should be written.
		catch(Exception e)// if we don't know the Exception // father exception
		{
			System.out.println("The exception is fired"+e);
		}
		finally {// finally should be after catch block
			System.out.println("inside finally block");
		}
		System.out.println("After the calculation");

	}

}
