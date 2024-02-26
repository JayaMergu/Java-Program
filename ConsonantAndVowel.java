/* Create a Java program that prompts the user to enter a character and determines whether the character is a vowel or a consonant. using use case */
import java.util.Scanner;
class ConsonantAndVowel{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the alphabet"); 
        char ch=sc.next().charAt(0);
        char alpa;
        if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' ||ch=='o' || ch=='i' || ch=='u'){
			alpa='a';
		}else{
			alpa='b';
		}
        switch(alpa){
            case 'a':
                System.out.println("Vowel");
                break;
            //case 'b':
              //  System.out.println("Consonant");
                //break;    
            default:
                System.out.println("Consonant");
                break;  
        }
    }
}