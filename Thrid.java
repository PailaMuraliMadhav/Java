import java.util.Scanner;
public class Thrid{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        float b=sc.nextFloat();
        byte c=sc.nextByte();
        double d=sc.nextDouble();
        short e=sc.nextShort();
        boolean f=sc.nextBoolean();
        char g=sc.next().charAt(0); // Corrected line
        System.out.println("int is: " + a);
        System.out.println("float is: " + b);
        System.out.println("byte is: " + c);
        System.out.println("double is: " + d);
        System.out.println("short is: " + e);
        System.out.println("boolean is: " + f);
        System.out.println("char is: " + g);
    }
}
