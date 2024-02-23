
public class varags
{ 
    void fun(int ...a){
        System.out.println("____________________");
        for(int i:a)
        System.out.println(i);
    }
    public static void main(String[] args){
        varags sc= new varags();
        sc.fun(1);
        sc.fun();
        sc.fun(1,2,3,4,5,6,7,8,9,0);
        
    }
       
}