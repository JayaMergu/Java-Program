package Pack1;
// Default can be accesed in the same package but not outside package
// Public can be accesed outside and inside the packgae without inheriting
// protected can be accesed by the child class in same package and outside packgae but with only inheritance
// Private cannot be accesed by anyone
class DemoEx{
    public static void main(String args[]){
        DemoEx1 d=new DemoEx1();
        d.add(12,13);
        System.out.println("Inside public class of Demo");
    }
}
