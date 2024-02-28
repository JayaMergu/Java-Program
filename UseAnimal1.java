class Animal1{// animal parent class is created
    int a=100;//attribute of parent class
    Animal1(){
        System.out.println("Animal class Constructor");//constructor
    }
    public void eat(){ // method of parent class, protected cannot be inherited
        System.out.println("The Animal is eating");
    }
}
class Dog extends Animal1{//created the child class using extend keyword
    int a=200;//sttribute of child class
    Dog(){
        super();
        System.out.println("child class constructor");// constructor
    }
    public void eat(){
        System.out.println("The Dog is eating dog food");
    }
}
class UseAnimal1{//main class
    public static void main(String args[]){
        Dog d1=new Dog(); // creating objecty of child class
        d1.eat();// calling method of parent class through child
    }
}