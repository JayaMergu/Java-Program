/**Implement methods for addition, subtraction, multiplication, and division using method overloading to handle different types and numbers of operands*/
class Calculator1{
    void operation(int a,int b){
        int ans=a+b;
        System.out.println("The addition of two operands :"+ans);
    }
    void operation(float a,float b){
        float ans=a*b;
        System.out.println("The multiplicatio of two operands :"+ans);

    }
    void operation(long a,long b){
        long ans=a/b;
        System.out.println("The division of two operands :"+ans);
    }
    void operation(double a,double b){
        double ans=a-b;
        System.out.println("The sunstraction of two operands is: "+ans);
    }
}
class Calculator1Demo{
    public static void main(String args[]){
        Calculator1 c=new Calculator1();
        c.operation(23.23,54.45);// depends on the values provided the operation is done
    }
}