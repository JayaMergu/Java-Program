class Student{
    int id;
    String name;
    static String collegeName="SSWCOE";
    void getValue(int id,String name){
        this.id=id;
        this.name=name;
        System.out.println("Name is:"+name+" id is:"+id);
    }
}
class StaticDemo{
    public static void main(String args[]){
        Student s1=new Student();
        Student s2=new Student();
        //s2.collegeName="anudip";// change will modified in main
        s1.getValue(1,"jaya");
        s2.getValue(2,"jd");
        System.out.println("s1.college name is:"+s1.collegeName);
        System.out.println("s2.college name is:"+s2.collegeName);
    }
}