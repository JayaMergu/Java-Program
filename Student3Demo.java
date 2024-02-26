/* parameterized Constructor*/
class Student3{ //creating class student 
    int rollNo; // attributes of class
    String name;
    public Student3(int rollNo,String name){ //parameterized constructor
        this.rollNo=rollNo; //  linking
        this.name=name;
        System.out.println("This is parameterized Constructor");
    }
    void printData(){ // method to print values
        System.out.println("roll no is:"+rollNo+" Name is: "+name);
    }
}
class Student3Demo{ //main class
    public static void main(String args[]){
        Student3 s1=new Student3(101,"Jaya"); //creating object and passing values
        s1.printData(); // calling method
    }
}