/**product class with parameterized  */
class Product1{ // class Product
    String productName;
    int price; // attributes of shape
    public Product1(String productName,int price){ // constructor
        this.productName=productName;
        this.price=price;
        System.out.println("This is parameterized Constructor");
    }
    void printData(){ // to print using method
        System.out.println("Product name: "+this.productName+" price: "+this.price);
    }
}
class Product1Demo{ // main class 
    public static void main(String args[]){ 
        Product1 p1=new Product1("traingle",20); // parameterized constructor object creation
        p1.printData(); // calling method
    }
}