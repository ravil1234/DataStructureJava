package recursionques;
import java.util.*;
public class allindices {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of array");
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
        	System.out.println("enter value at"+ i+ "position");
        	arr[i]=sc.nextInt();
        }
        int si=0,count=0;
        System.out.println("enter number which index is to calc.");
        int data=sc.nextInt();
        	int ans[]=allin(arr,si,data,count);
        	display(ans);
	}
	public static int[] allin(int arr[],int si,int data,int count)
	{
		int indices[]=null;
		if(si==arr.length)
		{
			int ar[]=new int[count];
			return ar;
		}
		if(arr[si]==data)
		{
			indices=allin(arr,si+1,data,count+1);
		}
		else
		{
	    indices=allin(arr,si+1,data,count);
	       }
          if(arr[si]==data)
          {
        	 indices[count]=si; 
          }
          return indices;
    }
	public static void display(int ans[])
	{
		for(int i=0;i<ans.length;i++)
		System.out.print(ans[i]+" ");
	}
}
