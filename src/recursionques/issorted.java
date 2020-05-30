package recursionques;
import java.util.*;
public class issorted {
	public static void main(String[] args) {
        int n,si;
        Scanner sc=new Scanner (System.in);
        System.out.println("enter length of array");
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
        	arr[i]=sc.nextInt();
        }
        si=0;
        System.out.println(issort(arr,si));
	}
public static boolean issort(int arr[],int si)
{ if(si==arr.length-1)
    	return true;
     if(arr[si]>arr[si+1])
     {
    	return false;
     }
     else
     {
    	
    	 return issort(arr,si+1);
     }
   }
}
