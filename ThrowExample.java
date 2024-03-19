package com.exceptionexample;
import java.util.Scanner;

public class ThrowExample {

	public static void main(String[] args) {
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age: ");
		age=sc.nextInt();
		if(age<18) {
			throw new ArithmeticException("you are not elligible for driving license");
		}
		else {
			System.out.println("you are elligible to have licence");
		}
	}

}
