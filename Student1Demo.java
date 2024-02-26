//Create object
class Student1{
	int sid;//Data members
	String sname;
	int age;
}
class Student1Demo{
	public static void main(String args[]){
		Student1 s1=new Student1();
		s1.sid=1;
		s1.sname="Prana";
		s1.age=22;
		System.out.println("ID :"+s1.sid+"\nName :"+s1.sname+"\nAge :"+s1.age);
	}
}