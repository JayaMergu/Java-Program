import java.util.Scanner;
class Employee{//Employee class with No arg Constructor
    String Ename;
    Employee(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee name ");
        this.Ename=sc.next();
    }
    void printData(){
        System.out.println("The name is: "+Ename);
    }
}
class EmployeeDemo{
    public static void main(String args[]){
        Employee e1=new Employee();
        e1.printData();//Object 
    }
}