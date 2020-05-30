package recursionques;
import java.util.*;
public class lastindex {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter length of array");
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
        	System.out.println("enter value at"+ i+ "position");
        	arr[i]=sc.nextInt();
        }
        int si=0;
        System.out.println("enter number which index is to calc.");
        int data=sc.nextInt();
       System.out.println(lindex(arr,si,data));
	}
	public static int lindex(int arr[],int si,int data)
	{
        if(si==arr.length)
        	return -1;
        int index=lindex(arr,si+1,data);
        if(index==-1)
        {
        if(data==arr[si])
        {
        	return si;
        }
        else
        	return -1;
	}
        else
        {
        	return index;
        }
	}
}
