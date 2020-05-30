package aug_PRACTICE;
import java.util.*;
public class bookallocation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       while(t!=0)
       {
    	   int n=sc.nextInt();
    	   int k=sc.nextInt();
    	   long a[]=new long[n];
    	   for(int i=0;i<n;i++)
    	   {
    		   a[i]=sc.nextLong();
    	   }
    	System.out.println(book(a,n,k));
    	   t--;
       }
	}
public static long book(long a[],int n,int k)
{
	 long tot=0;
	 for(int i=0;i<a.length;i++)
	 {
		 tot=tot+a[i];
	 }
	 long hi=tot;
	 long lo=a[a.length-1];
	 long ans=0;
	 while(lo<=hi)
	 {
		 long mid=(lo+hi)/2;
		 boolean isvalid=Valid(a,k,mid);
		 if(isvalid)
		 {
			 ans=mid;
			 hi=mid-1;
		 }
		 else
		 {
			 lo=mid+1;
		 }
	 }
	 return ans;
}
public static boolean Valid(long a[],int k,long mid)
{
	long sum=0;
	int std=1;
	for(int i=0;i<a.length;i++)
	{
		sum=sum+a[i];
		if(sum>mid)
		{
			std++;
			sum=a[i];
			if(std>k)
			{
				return false;
			}
		}
	}
	return true;
}
}
/*
 public static long min(long[] arr, long n, long k) {
        long lo = arr[arr.length - 1];
        long totalpages = 0;
        long hi = 0;
        for (int i = 0; i < n; i++) {
            totalpages += arr[i];
        }
        hi = total_pages;
        long ans = 0;
        while (lo <= hi) {
            long mid = (lo + hi) / 2;
            boolean isvalid = isValid(arr, k, mid);
            if (isvalid) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }
    private static boolean isValid(long[] arr, long k, long mid) {
        long sum = 0;
        int noOfstudents = 1;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > mid) {
                noOfstudents++;
                sum = arr[i];
                if (noOfstudents > k) {
                    return false;
                }
            }
        }
        return true;
    }
 */ 
