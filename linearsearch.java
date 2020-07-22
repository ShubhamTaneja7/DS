import java.util.*;
public class linearsearch {
    public static void main(String[] args){
       Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        int [] a=new int [n];
        int i;
        
        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println("Enter the no. to find");
        int x=s.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]==x)
            {
                System.out.println(x+" was found at "+i+" location");
            }
        }
    }
    
    
}