/**Shape class with parameterized  */
class Shape1{ // class shape
    String shapeName,color; // attributes of shape
    public Shape1(Shape1tring shapeName,String color){ // constructor
        this.shapeName=shapeName;
        this.color=color;
        System.out.println("This is parameterized Constructor");
    }
    void printData(){ // to print using method
        System.out.println("Parameter: "+this.shapeName+" color: "+this.color);
    }
}
class Shape1Demo{ // main class 
    public static void main(String args[]){ 
        Shape1 s1=new Shape1("traingle","pink"); // parameterized constructor object creation
        s1.printData();
    }
}
