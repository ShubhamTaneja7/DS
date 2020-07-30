import java.util.*;
public class binarysearch1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
		int find=scan.nextInt();
		binarysearch1 ob = new binarysearch1();
		int search = ob.binarysearch(arr, 0, n - 1, find);
		if (search == -1) 
		System.out.println("Element not found"); 
	else
		System.out.println("Element found at index " + search); 
	}
	int binarysearch(int arr[], int lb, int ub , int find) 
    { 
        if (ub>= lb) { 
            int mid = (lb+(ub-1)) / 2; 
            if (arr[mid] == find) 
                return mid; 
            else if (arr[mid] > find) 
                return binarysearch(arr, lb, mid - 1, find); 
  
            return binarysearch(arr, mid + 1, ub, find); 
        } 
  
        return -1; 
    } 
    
}