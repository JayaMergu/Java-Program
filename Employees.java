//Create a program for Employees Id, name, age
class Emp1{
	int emp_id;
	String emp_name;
	int age;
}
class Employees{
	public static void main(String args[]){
		Emp1 e1=new Emp1();// can create multiple object inheriting class struccture
		e1.emp_id=101;
		e1.emp_name="Pranali";
		e1.age=21;
		System.out.println("ID :"+e1.emp_id+"\nEmp Name :"+e1.emp_name+"\nAge :"+e1.age);

		Emp1 e2=new Emp1();// e1,e2 are object names
		e2.emp_id=102;
		e2.emp_name="Jaya";
		e2.age=21;
		System.out.println("ID :"+e2.emp_id+"\nEmp Name :"+e2.emp_name+"\nage :"+e2.age);
	}

}