import java.util.Scanner;
public class ARRAY{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int sum =0;
       System.out.println("enter no of subjects: ");
       int sub=sc.nextInt();
       int []a= new int[sub];
       for(int i=0;i<sub;i++){
           a[i]=sc.nextInt();
           sum=sum+a[i];
           
       }
       System.out.println("avg: " +sum/sub);
        
    }
}
