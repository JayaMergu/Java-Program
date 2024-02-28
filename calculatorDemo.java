/** type conversion in Construction Overloading*/
class Calculator2{
    void add(int s,int b){
        System.out.println("The method with two int arguments");
    }
    void add(double a,double b){
        System.out.println("The method with double agruments");
    }
}
class Calculator2Demo{
    public static void main(String args[]){
        Calculation c=new Calculation();
        c.add(84.68,97.875);
    }
}