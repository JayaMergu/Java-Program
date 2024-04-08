package com.java8features;
//functional interfaces
// there is no need to define method again and again
interface Demo1{
	//public void display();1
	public void display(String name);//2
	//public void display(String name,String str);//3
	
	default void show() {
		System.out.println("default method body or implementation can be given in interface and is considered as non abstract ");
	}
	static void run() {
		System.out.println("static method can be in functional interface ");
	}
}

public class LamdaExpression {

	public static void main(String[] args) {
		Demo1 d=(name)->{//lambda expression
			System.out.println("hello "+name);//2
			//	System.out.println("hello "+name+""+str);//two parameter// 3
		};
		//d.display();1
		d.display("jaya");//2
		//d.display("jaya","jk");// double parameter//3
		d.show();
		Demo1.run();//calling static only done by class name not by object name
	}

}
/*without parameter
 * ()->{
 * body without parameter
 };
 * */
/*with parameter
 * (p1)->{
 * body with parameter
 * };
 * */