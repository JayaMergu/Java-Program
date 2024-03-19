package com.exceptionexample;

public class Example2 {

	public static void main(String[] args) {
		try {
				System.out.println("This is before the calculation");
				int a=10,b=0;
				int val=a/b;
				System.out.println("The output is"+val);
				System.out.println("After the calculation");
			}
		catch(Exception e)
		{
			System.out.println("The exception is fired"+e);
		}
		// TODO Auto-generated method stub
	}
}
