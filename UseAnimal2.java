abstract class Animal{
    void eat(){
        System.out.println("hello");
    }
    abstract void breed();
}
abstract class Dig extends Animal{

}
class Puppy extends Dig{
    void breed(){
        System.out.println("hii");
    }
}
class UseAnimal2{
    public static void main(String args[]){
        Puppy p1=new Puppy();
        p1.eat();
        p1.breed();
    }
}