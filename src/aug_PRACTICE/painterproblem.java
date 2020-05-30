package aug_PRACTICE;
import java.util.*;
public class painterproblem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int k=sc.nextInt();
       int n=sc.nextInt();
       long a[]=new long[n];
       for(int i=0;i<n;i++)
       {
    	   a[i]=sc.nextLong();
       }
       System.out.println(book(a,n,k));
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
		 while(lo<hi)
		 {
			 long mid=(hi+lo)/2;
			 int r=numberOfPainters(a,n,mid);
			 if(r<=k)
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
	 static int numberOfPainters(long arr[], int n, long maxLen) 
	    { 
	        long total = 0; int numPainters = 1; 
	  
	        for (int i = 0; i < n; i++) { 
	            total += arr[i]; 
	  
	            if (total > maxLen) { 
	  
	                // for next count 
	                total = arr[i]; 
	                numPainters++; 
	            } 
	        } 
	  
	        return numPainters; 
	    } 
}
