import java.util.*;
public class Array2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int i,j;
        for( i=0;i<rows;i++){
            System.out.println("Enter "+(i+1)+" number");
            a[i]=sc,nextInt();
            for( j=1;j<cols;j++){
                System.out.println("Enter "+(j+1)+" number");
                a[j]=sc.nextInt();
            }
            

        }

    }
    
}
