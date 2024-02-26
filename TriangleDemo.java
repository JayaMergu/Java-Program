
/*Create a class named Triangle with attributes side1, side2, and side3. Include methods to calculate the perimeter and area of the triangle.
*/import java.util.Scanner;
class Triangle{// creating a Triangle class and put variables (attributes) related to class
    double side1,side2,side3,base,height; //all are the attributes of Triangle
    void getData(){ // to get data from user 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The side 1 Value of Triangle ");
        this.side1=sc.nextDouble();
        System.out.println("Enter The side 1 Value of Triangle");
        this.side2=sc.nextDouble();
        System.out.println("Enter The side 1 Value of Triangle");
        this.side3=sc.nextDouble();
        System.out.println("Enter The base Value of Triangle");
        this.base=sc.nextDouble();
        System.out.println("Enter The height Value of Triangle");
        this.height=sc.nextDouble();
    }
    void perimeterCalculate(){// to calculate the perimeter 
    double temp=side1+side2+side3;
        System.out.println("The perimeter of Triangle is: "+temp);
    }
    void areaCalculate(){ // to calculate the area 
    double area=(base*height)/2;
        System.out.println("The area of Triangle is: "+area);
    }
}
class TriangleDemo{
    public static void main(String args[]){
        Triangle t1=new Triangle();
        t1.getData(); //calling the functions
        t1.perimeterCalculate(); 
        t1.areaCalculate();
    }
}
