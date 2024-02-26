/**Create a class Product with attributes such as name, price, and category. Implement a no-argument constructor to initialize these attributes with default values.*/
import java.util.Scanner;
class Product{
    String name;
    Float price;
    String category;
    Product(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Product name ");
        this.name=sc.nextLine();
        System.out.println("Enter Product price ");
        this.price=sc.nextFloat();
        System.out.println("Enter Product category ");
        this.category=sc.next();
    }
    void printData(){
        System.out.println("The product name is: "+name+" price is: "+price+" category: "+category);
    }
}
class ProductDemo{
    public static void main(String args[]){
        Product p1=new Product();
        p1.printData();
    }
}