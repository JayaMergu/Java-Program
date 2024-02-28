/**Overloading */
class Calculation{
    int sum;
    void add(){ //add method to overloading
        int a=10,b=20;
        this.sum=a+b;
        System.out.println("The sum is :"+sum);
    }
    void add(int a,int b){// with parameter 
        this.sum=a+b;
        System.out.println("The sum is :"+sum);
    }
    void add(double a,double b){
        double sum1=a+b;
        System.out.println("the sum is :"+sum1);
    }
}
class CalculationDemo{
    public static void main(String args[]){
        Calculation c=new Calculation();
        c.add();//method no arg
        c.add(300,400);//method with parameter
        c.add(22.33,45.46);//with another datatypes
    }
}