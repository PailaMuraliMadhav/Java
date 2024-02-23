import java.util.Scanner;
public class jaggedArray{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("rows: ");
        int rows,cols;
        rows=sc.nextInt();
        int jagg[][]=new int[rows][];
        for(int i=0;i<rows;i++){
            System.out.print("Cols= ");
            cols=sc.nextInt();
            jagg[i]=new int [cols];
            for(int j=0;j<cols;j++){
                System.out.print("enter value: " + (j+i)+ " = ");
                jagg[i][j]=sc.nextInt();

            }
        }
        for(int i=0;i<jagg.length;i++){
            for(int j=0;j<jagg[i].length;j++){
                System.out.print(jagg[i][j]+"\t");

            }
            System.out.println();
            
        }
    }
}