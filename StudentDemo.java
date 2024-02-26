import java.util.Scanner;
class Student1{
    int sid;
    String sname;
    int age;
    void getData(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student ID");
        this.sid=sc.nextInt();
        System.out.println("Enter Student Name");
        this.sname=sc.next();
        System.out.println("Enter Student Age");
        this.age=sc.nextInt();
    }
    void putData(){
        System.out.println("ID " + this.sid + " Name " + this.sname + " Age " + age);
    }
}
class StudentDemo{
    public static void main(String args[]){
        Student1 s1=new Student1();
        s1.getData();
        s1.putData();
        Student1 s2=new Student1();
        s2.getData();
        s2.putData();
    }
}