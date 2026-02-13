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
            for( j=0;j<cols;j++){
                System.out.println("Enter number");
                a[i][j]=sc.nextInt();
            }
            

        }

    }
    
}
