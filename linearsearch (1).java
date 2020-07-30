import java.util.*;
public class linearsearch {
    public static void main(String[] args){
       Scanner scan=new Scanner(System.in);
        
        int n=scan.nextInt();
        int arr[]=new int [n];
        int i;
        
        for(i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        int find=scan.nextInt();
        for(i=0;i<n;i++)
        {
            if(arr[i]==find)
            {
                System.out.println("Element was found at "+i+" location");
            }
        }
    }
    
    
}