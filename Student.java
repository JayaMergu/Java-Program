//OOP'S Concept in Java Example
class Student{
    int sid;
    String sname;
    String phone;
    String email;
    public static void main(String args[]){
	    Student s1=new Student();//object s1 creating in java
	    s1.sid=101;
	    s1.sname="Pranali";
	    s1.phone="9096409360";
	    s1.email="pranali@gmail.com";
	    System.out.println("ID :"+s1.sid+"\nName :"+s1.sname+"\nphone :"+s1.phone+"\nEmail :"+s1.email);
	    Student s2=new Student();
	    s2.sid=102;
	    s2.sname="Akki";
	    s2.phone="123456789";
	    s2.email="akki@gmail.com";
	    System.out.println("ID :"+s2.sid+"\nName :"+s2.sname+"\nphone :"+s2.phone+"\nEmail :"+s2.email);
    }
}