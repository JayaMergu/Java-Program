package com.exceptionexample;

public class Example1 {

	public static void main(String[] args) {
		System.out.println("This is before the calculation");
		int a=10,b=0;
		try {
				int val=a/b;
				System.out.println("The output is"+val);
			}
		catch(Exception e)
		{
			System.out.println("The exception is fired"+e);
		}
		// TODO Auto-generated method stub
		System.out.println("After the calculation");
	}
}
