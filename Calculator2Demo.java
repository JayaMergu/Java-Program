/** type conversion in Construction Overloading*/
class calculator{
    void add(int s,int b){
        System.out.println("The method with two int arguments");
    }
    void add(double a,double b){
        System.out.println("The method with double agruments");
    }
}
class calculatorDemo{
    public static void main(String args[]){
        Calculation c=new Calculation();
        c.add(84.68,97.875);
    }
}