package recursionques;
import java.util.*;
public class firstindex {
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
       System.out.println(findex(arr,si,data));
	}
	public static int findex(int arr[],int si,int data)
	{
		if(si==arr.length)
			return -1;
		if(arr[si]==data)
			return si;
		else	
		return findex(arr,si+1,data);
		
	}

}
