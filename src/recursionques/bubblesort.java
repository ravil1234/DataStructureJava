package recursionques;
import java.util.*;
public class bubblesort {
	public static void main(String args[])
	{
		int n,si,li,i;
		Scanner sc=new Scanner(System.in);
		//System.out.println("enter length of array");
	        n=sc.nextInt();
	        int arr[]=new int[n];
	        for(i=0;i<n;i++)
	        {
	        	System.out.println("enter value at"+ i+ "position");
	        	arr[i]=sc.nextInt();
	        }
	        si=0;
	        li=n-1;
	        bubble(arr,si,li);
	      for(i=0;i<arr.length;i++)
	      {
	    	  System.out.print(arr[i]);
	      }
	}
	public static void bubble(int arr[],int si,int li)
	{
		if(li==0)
		{
			return;
		}
		if(si==li)
		{
			bubble(arr,0,li-1);
			return;
		}
			if(arr[si]>arr[si+1])
			{
			int	temp=arr[si];
			arr[si]=arr[si+1];
			arr[si+1]=temp;
			}
			bubble(arr,si+1,li);
		
	}

}
