import java.util.Scanner;
public class CivilWar
{
    public static void main(String[] args) 
    {
        int n, x, flag = 0, i = 0,sum=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        if(n == 3)
        {
            sum=a[2]+a[0]+a[1];
        }
        else
        {
           sum=a[4]+a[0]+a[3]+a[1]+a[2];
        }
        System.out.println(sum);
    }
}
