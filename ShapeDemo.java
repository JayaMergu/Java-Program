/*Define a class Shape with attributes like type and color. Implement a no-argument constructor to initialize these attributes with default values.*/
import java.util.Scanner;
class Shape{ //class shape 
    String type; //attribute of shape
    String color;
    Shape(){ //No arg Constructor
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the shape Type: ");
        this.type=sc.next(); // taking info
        System.out.println("Enter the shaoe color"); 
        this.color=sc.next();    
    }
    void printData(){ // method to  print data 
        System.out.println("The type is: "+type);
        System.out.println("The color is: "+color);
    }
}
class ShapeDemo{
    public static void main(String args[]){
            Shape s1=new Shape(); // creating object 
            s1.printData(); // calling method through object
    }
}