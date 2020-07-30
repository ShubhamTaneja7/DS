import java.util.*;
public class bubblesort {
    public static void main(String[] args){
       Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int [n];
        int i,j,temp;
        for(i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
    for(i=0;i<n;i++)
    {
        int flag=0;
        for( j=0;j<n;j++)
        {
            if(arr[j]>arr[j+1])
            {
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                flag=1;
            }
        }
        if(flag==0)
        {
            break;
        }
    }
    for(i=0;i<n;i++)
        {
           System.out.println(arr[i]);
        }
}
}
