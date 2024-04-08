/*1.write  a java program  to implement a program that demonstrates Lambda Expressions with single parameter*/
package com.java8features;
interface Example{
	public void display(int a);
}

public class LambdaExample {
	public static void main(String[] args) {
		Example ex=(a)->{
			System.out.println("value is"+a);
		};
		ex.display(10);
	}

}
