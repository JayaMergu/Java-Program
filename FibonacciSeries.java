/**Upto The given number finding the Fibonacci Series By taking That limit From user  */
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limit for Fibonacci series: ");
        int limit = scanner.nextInt(); //taking input from user for printig fibo upto that 
        System.out.println("Fibonacci series up to " + limit + " is:"); //printing limit
        int num1 = 0, num2 = 1, nextTerm;
        while (num1 <= limit) { //moves to next only when true 
            System.out.print(num1 + " "); //printing value

            nextTerm = num1 + num2; //3=1+2
            num1 = num2;//2=2
            num2 = nextTerm;//3=3
        }
        scanner.close();// can be used to close the scanner function use in program . 
    }
}