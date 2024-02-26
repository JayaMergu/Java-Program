/**creating class for string converting
*/
import java.util.Scanner;
class StringCovertion{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        void StringCovertion(){
            
        }
        String line;
        line=sc.nextLine();
        String strArray[] = line.split(" ");
        for (int i = 0; i < strArray.length; i++){
            // Printing the elements of String array
            //System.out.print(strArray[i] + ", ");
        }
        String[] stringArray = new String[9];
            // Access and print elements in the array
        for (int i = 0; i < stringArray.length; i++ ){
            if(i==0 || i==3 || i==6){
                System.out.println(myStr.replace('a', '#'));
                System.out.println(myStr.replace('e', '#'));
                System.out.println(myStr.replace('i', '#'));
                System.out.println(myStr.replace('o', '#'));
                System.out.println(myStr.replace('u', '#'));
            }
            if(i==1 || i==4 || i==7){
                System.out.println(myStr.replace('', '@'));
            }
            stringArray[i]=strArray[i];

           // System.out.print(stringArray[i] + " ");
        }
        
    }
}

         