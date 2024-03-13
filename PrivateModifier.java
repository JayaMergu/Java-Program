package Pack1;
class PrivateModifier{
    private void printData(){
        System.out.println("I am in private printData method");
    }
    public void display(){
        System.out.println("I am in public display method");
    }
}
class UsePrivate{
    public static void main(String args[]){
        PrivateModifier p=new PrivateModifier();
        p.printData();
        p.display();
    }
}