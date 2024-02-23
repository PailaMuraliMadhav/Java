public class student{
    int age,marks;
    String name;
    student(){
        System.out.println("Hi");
    }
    student(int age, int marks, String name){
        //this();
        age=age;
        marks=marks;
        name=name;
        print();

    }
    void print(){
        System.out.println(age+" "+marks+" "+name);
    }
   
    {
        System.out.println("Bye");
    }
    public static void main(String[] args){
    student sc=new student(20,200,"Murali");}
    //sc.print();
    

}