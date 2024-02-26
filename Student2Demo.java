class Student2{
    int sid;//attributes
    String sname;
    Student2(){// constructor
        this.sid=101;
        this.sname="Jaya";
        System.out.println("in Constructor no arguments");
    }
    void printData(){ //method
        System.out.println("sid is: "+sid+" name is: "+sname);
    }
}
class Student2Demo{
    public static void main(String args[]){
        Student2 s1=new Student2();//object creation
        s1.printData(); // calling method
    }
}