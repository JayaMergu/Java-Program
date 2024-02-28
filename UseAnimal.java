/**inheritencs: Inheriting the properties and methods of oe class to another class
 * and super keyword is used to call the parent class method or attribute
*/
class Animal{// animal parent class is created
    int a=100;//attribute of parent class
    Animal(){
        System.out.println("Animal class Constructor");//constructor
    }
    public void eat(){ // method of parent class, protected cannot be inherited
        System.out.println("The Animal is eating");
    }
}
class Dog extends Animal{//created the child class using extend keyword
    int a=200;//sttribute of child class
    Dog(){
        super();
        System.out.println("child class constructor");// constructor
    }
    public void bark(){
        System.out.println("Dog is barking");
        System.out.println("The value of a is: "+super.a);//to call parent attribute
    }
}
class UseAnimal{//main class
    public static void main(String args[]){
        Dog d1=new Dog(); // creating objecty of child class
        d1.eat();// calling method of parent class through child
        d1.bark();//calling method of child class
    }
}