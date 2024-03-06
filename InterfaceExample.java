/** interface is a father of abstract
interface is 100% abstract. abstract had an option we can abstrcat then and normal methods also
we use the jeyword interface to create interface 
we cannot create object of interface 
to use interface u have to implement and give body to all methods
*/
interface Animal{
    public void read();
}
interface Calculation{// creating an interface
    public void sides();//abstract methods 
    public void area();// without public also works
    
}
class Rectangle implements Calculation,Animal{ // sub class will give the body to methods
    public void sides(){
        System.out.println("inside sides method");
    }
    public void area(){
        System.out.println("inside area method");
    }
    public void read(){
         System.out.println("inside read method");
    }
}
class InterfaceExample{
    public static void main(String args[]){
        Rectangle r=new Rectangle();
        r.sides();
        r.area();
        r.read();
    }
}