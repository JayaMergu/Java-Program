//Create a program for Employees Id, name, age by taking input from user
import java.util.Scanner;
class Emp1{
	int emp_id;
	String emp_name;
	int age;
	void input(){ // for taking employee deatils from user
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee id");
        emp_id=sc.nextInt();
		System.out.println("Enter Employee name");
        emp_name=sc.next();
		System.out.println("Enter Employee age");
        age=sc.nextInt();
    }
    void output(){// for taken inputs showing to user
        System.out.println(" Employee id"+emp_id);
        System.out.println(" Employee name"+emp_name);
        System.out.println(" Employee age"+age);
        
	}
}
class InputEmployee{
	public static void main(String args[]){
		Emp1 e1=new Emp1();// can create multiple object inheriting class struccture
        e1.input(); // calling the methods of class Emp1 using object
        e1.output();
		Emp1 e2=new Emp1();// e1,e2 are object names
        e2.input();
        e2.output();
	}

}