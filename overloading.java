public class overloading{
    int a;
    overloading(int a,int b){
        System.out.println("Hello" + (a+b));
    }
    
    public static void main(String[] args){
    overloading mk=new overloading(2,3);
    System.out.println(mk.a);
        
    }
}




