/**if we make a class final we cannot inherit it  */
final class Cat{
    static int a=100; 
    void eat(){
        System.out.println("The cat is eating"+a);
    }
}
class Dog extends Cat{// trying to ihnerit final class
    void eat(){// trying to override method
        System.out.println("The Dog is eating. "+a);
    }
}
class CatDemo{
    public static void main(String args[]){
        Cat c=new Cat();
        c.a=200;// object creatio
        c.eat(); // method calling
    }
}