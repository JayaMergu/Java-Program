import java.util.Scanner;  // Import the Scanner class

class VowelConsonant {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");
     char userName = myObj.nextChar(); // Read user input
     if(userName==("A"||"a"||"i"||"o"||"u"||"E"||"I"||"O"||"U")){
    System.out.println("Consonant" + userName);  // Output user input  
     }else{
    System.out.println("Voal : " + userName);  // Output user input
    }
  }
}