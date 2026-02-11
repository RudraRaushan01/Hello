import java.util.*;

public class ArrayI{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Array values: ");
        int ar=sc.nextInt();
        int a[]=new int[ar];
        int i;
        for(i=0;i<ar;i++){
            System.out.println("Enter "+(i+1)+" number: ");
            a[i]=sc.nextInt();
        }
    
        System.out.println("Enter elements to search: ");
        int search=sc.nextInt();
        for(i=0;i<ar;i++){
            if(search==a[i])
                break;
        }
    
        if(i==ar)
            System.out.println("Unsuccessfull search");
        else
        System.out.println("Element is at position "+(i));   
    }
    
}
