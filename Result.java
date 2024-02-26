class Result{
    public static void main(String args[]){
        char grades='H';
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