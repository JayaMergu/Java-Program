/* Create a Java program that prompts the user to enter a character and determines whether the character is a vowel or a consonant. using use case */
import java.util.Scanner;
class ConsonantVowel{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the alphabet"); 
        char apla=sc.next().charAt(0);
        switch(apla){
            case 'A':
                System.out.println("Vowel");
                break;
            case 'E':
                System.out.println("Vowel");
                break;    
            case 'I':
                System.out.println("vowel");
                break;
            case 'O':
                System.out.println("Vowel");
                break;    
            case 'U':
                System.out.println("vowel");
                break;   
            case 'a':
                System.out.println("vowel");
                break;
            case 'e':
                System.out.println("vowel");
                break;
             case 'i':
                System.out.println("vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;    
            case 'u':
                System.out.println("vowel");
                break;     
            default:
                System.out.println("Consonant");
                break;  
        }
    }
}