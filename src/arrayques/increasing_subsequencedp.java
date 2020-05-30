package arrayques;
import java.util.*;
public class increasing_subsequencedp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
			int n=sc.nextInt();
			long a[]=new long[n];
			long w[]=new long[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextLong();
			}
			for(int i=0;i<n;i++)
			{
				w[i]=sc.nextLong();
			}
			System.out.println(lis(a,n,w));
			t--;
		}
		
	}
	static long max_ref; 
	static long max =0;
	   static long _lis(long arr[], int n,long w[]) 
	   { 
	       if (n == 1) 
	           return 1; 
	       long res, max_ending_here = 1;
	       long sum=0;
	        for (int i = 1; i <n; i++) 
	        { 
	            res = _lis(arr, i,w);
	            if (arr[i-1] < arr[n-1] && res + 1 > max_ending_here) 
	            {
	                max_ending_here = res + 1; 
	                sum=sum+w[i-1];
	                System.out.println(sum);
	            }
	        }
	        if (max < sum)
	        {
	           max=sum;
	           
	        } 
	        return sum; 
	   } 
	    static long lis(long arr[],int n,long w[]) 
	    { 
	         max_ref = 1; 
	         max=0;
	        _lis( arr, n,w);  
	        return max; 
	    } 
}
