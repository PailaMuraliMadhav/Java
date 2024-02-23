class A{
    int roll=12219353;
    void fun(){
        System.out.println("This is class A");
    }
}

class B extends A{
    void fun1(){
        System.out.println(roll);
    }
}
public class Main{
    public static void main(String[] args){
        B obj=new B();
        obj.fun();
        obj.fun1();
    }
}