class Student{
    String name;
    int marks,age;
    Student(String name, int age, int marks){
        this.name = name;
        this.age = age;
        this.marks = marks;
        System.out.println("Name: "+name+" Age: "+age+" Marks: "+marks);
    }
    void display(){
        System.out.println("Name: "+name+" Age: "+age+" Marks: "+marks);
    }
}
public class This {
    public static void main(String[] args) {
        String name = "Madhav";
        int age = 20,marks=100;
        Student obj = new Student(name,age,marks);
        obj.display();
    }
}