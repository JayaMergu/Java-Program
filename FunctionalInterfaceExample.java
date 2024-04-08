/*write a  java programs  to implement Functional Interface contains only one abstract method,Static method & default method*/
package com.java8features;
interface Demo2{
	public void run();
	static void display() {
		System.out.println("this is static method from functional interface");
	}
	default void show() {
		System.out.println("this is default method from functional iterface");
	}
}
public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		Demo2 d=()->{
			System.out.println("this is the run method from functional interfaces");	
		};
		d.run();
		d.show();
		Demo2.display();
		

	}

}
