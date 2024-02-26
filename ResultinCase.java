/*Develop a Java program that calculates the grade of a student based on his/her percentage. The grading system is as follows:

90% and above: Grade A
80% - 89%: Grade B
70% - 79%: Grade C
60% - 69%: Grade D
Below 60%: Grade F*/
class ResultinCase{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the grades"); 
        char grades=sc.nextChar;        
        switch(grades){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Very good");
                break;    
            case 'C':
                System.out.println("Good");
                break;   
            case 'D':
                System.out.println("Average");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("wrong input");
                break;    
        }
    }
}