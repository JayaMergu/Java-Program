/**Design a hierarchy of shapes. Start with a Shape class and then create subclasses like Circle, Rectangle, Triangle, etc. Each subclass should inherit common properties and methods from the Shape class.
*/
class Shape1{// parent class named shape1
    int a=100;//variable 
    Shape1(){// constructor creating
        System.out.println("This is constructor from Shape1 class ");        
    }
    void area(){ // method of this class
        System.out.println("This is area method from Shape1 class ");
    }
}
class Rectangle extends Shape1{ // child class
    int a=200;
    Rectangle(){// constructor creating
        super();//calling parent constructor
        System.out.println("This is constructor Rectangle class ");     
    }
    void area(){
        System.out.println("This is area method from Rectangle class: "+super.a);        
        System.out.println("attribute of a: "+a);
    }
    
}
class Circle extends Shape1{// child class
    int a=300;
    Circle(){// constructor creating
        super();//calling parent constructor
        System.out.println("This is constructor from Circle class "); 
    }
    void area(){
        System.out.println("This is area method from Circle class: "+super.a);        
        System.out.println("attribute of a: "+a);
    }
}
class Triangle extends Shape1{// child class
    int a=400;
    Triangle(){ // constructor creating
        super(); //calling parent constructor
        System.out.println("This is constructor from Triangle class "); 
    } 
    void area(){
        System.out.println("This is area method from Triangle class: "+super.a);        
        System.out.println("attribute of a: "+a);
    }
}
class UseShape1{
    public static void main(String args[]){
        Rectangle r1=new Rectangle();// creating object
        r1.area();// calling method
        Circle c1=new Circle();
        c1.area();
        Triangle t1=new Triangle();
        t1.area();
    }
}