class Demo{// for static block example
    static int c=30;//static variable normal in class
    //int d=40; // cannot be print in static block
    static{ //static block
        int a=10;// normal variables
        System.out.println("in static block: "+a);//printing
        System.out.println("the outside of static block the static variable "+c);// printing
    }
    public static void main(String args[]){ //main method
    int b=20;// in main method normal variable
       // System.out.println("in main method"+a); // printing a not posiible
       System.out.println("in main method"+b);// in main print stmt
    }
}