/**triangle class with parameterized  */
class Triangle1{ // class triangle
    double side1,side2,side3,base,height; // attributes of traingle 
    public Triangle1(double side1,double side2,double side3,double base,double height){ // constructor
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
        this.base=base;
        this.height=height;
        System.out.println("This is parameterized Constructor");
    }
    void calculateParameter(){ // to calculate parameter using method
        double parameter=side1+side2+side3;
        System.out.println("Parameter: "+parameter);
    }
    void calculateArea(){ // to calculate area using method
        double area=(base+height)/2;
        System.out.println("Area: "+area);
    }
}
class Triangle1Demo{ // main class 
    public static void main(String args[]){ 
        Triangle1 t1=new Triangle1(3,6,4,4,5); // parameterized constructor object creation
        t1.calculateParameter(); // calling methods
        t1.calculateArea();
    }
}