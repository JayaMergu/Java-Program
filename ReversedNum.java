/*create a prgm that reverse a no entered by the user and print the rev no*/
import java.util.Scanner;
public class ReversedNum 
{
    
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number :")
        int num = sc.nextInt();
        int rev = 0;
        
        while(num != 0) 
		{
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        
        System.out.println(rev);
    }
}