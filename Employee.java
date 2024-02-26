class Employee{
	int emp_id;
	String emp_name;
	String project_details;
	String salary;
	public static void main(String args[]){
		Employee e1=new Employee(); // firts object 
		e1.emp_id=101;
		e1.emp_name="Pranali";
		e1.project_details="Title : Occational Outfit Recommentation";
		e1.salary="50,000";
		System.out.println("ID :"+e1.emp_id+"\nEmp Name :"+e1.emp_name+"\nProject Details :"+e1.project_details+"\nSalary :"+e1.salary);

		Employee e2=new Employee(); //second object
		e2.emp_id=102;
		e2.emp_name="Nandini";
		e2.project_details="Title : ATM System";
		e2.salary="40,000";
		System.out.println("ID :"+e2.emp_id+"\nEmp Name :"+e2.emp_name+"\nProject Details :"+e2.project_details+"\nSalary :"+e2.salary);
	}

}