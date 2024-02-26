/*Develop a Java program that takes a month (as an integer) as input and prints the number of days in that month. Consider leap years for February.*/
import java.util.Scanner;
class LeapMonth{
 public static void main(String argu[]) 
{
	Scanner sc = new Scanner(System.in);

    System.out.print("Enter the Month of leap year : ");
	
    int month = sc.nextInt();
 
  switch (month)  
  {
		case 1:
			System.out.println("January has 31 Days");
			break;
		case 2:
			System.out.println("February has 28 Days");
			break;
		case 3:
			System.out.println("March has 31 Days");
			break;
		case 4:
			System.out.println("April has 30 Days");
			break;
		case 5:
			System.out.println("May has 31 Days");
			break;
		case 6:
			System.out.println("June has 30 Days");
			break;
		case 7:
			System.out.println("July has 31 Days");
			break;
		case 8:
			System.out.println("August has 31 Days");
			break;
		case 9:
			System.out.println("September has 30 Days");
			break;
		case 10:
			System.out.println("October has 31 Days");
			break;
		case 11:
			System.out.println("November has 30 Days ");
			break;
		case 12:
			System.out.println("December has 31 Days");
			break;
		default:
			System.out.println("Invalid month number.");
			break;
		}
	}
}