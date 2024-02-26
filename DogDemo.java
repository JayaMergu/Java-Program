
/*Create a class named Dog with attributes name, breed, and age. Include a method bark() that prints "The dog is barking!".
*/import java.util.Scanner;
class Dog{// creating a dog class and put variables (attributes) related to Dog class
    String name;
    String breed;
    int age;
    void getData(){ // to get data from user of dog
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Dog Name ");
        this.name=sc.next();
        System.out.println("Enter Dog Breed");
        this.breed=sc.next();
        System.out.println("Enter Dog age!");
        this.age=sc.nextInt();
    }
    void putData(){// to print the data 
        System.out.println("The name of Dog is: "+this.name+" Breed: "+this.breed+" Age: "+this.age);
    }
    void bark(){ // the function of dog
        System.out.println("The dog is barking!");
    }
}
class DogDemo{
    public static void main(String args[]){
        Dog d1=new Dog();
        d1.getData();
        d1.putData();
        d1.bark();
    }
}
