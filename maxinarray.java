import java.util.*;
public class maxinarray {
  	public static void main(String[] args) {
	    
	    Scanner scan = new Scanner(System.in);
	    int n=scan.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
    arr[i]=scan.nextInt();
}
int max=arr[0];
for(int i=0;i<n;i++)
{
 if(arr[i]>max) 
 {
     max=a[i];
 }
}
System.out.println(max);
}
}