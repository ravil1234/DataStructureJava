package aug_PRACTICE;
import java.util.*;
public class gcd_lcm {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
    while(t!=0)
    {
    	int n =sc.nextInt();
    	int m=sc.nextInt();
    	int a[]=new int[n];
    	for(int i=0;i<n;i++)
    	{
    		a[i]=sc.nextInt();
    	}
    	long ans=findlcm(a,n);
    	long max=1;
    	for(int i=2;i<=m;i++)
    	{
    		long val=(i*ans)/(gcd(ans,i));
    		if(val>ans)
    		{
    			max=i;
    			ans=val;
    		}
    	}
    	System.out.println(max);
    	t--;
      }
	}
	public static long gcd(long a, long b) 
	{ 
	    if (b == 0) 
	        return a; 
	    return gcd(b, a % b); 
	} 
 public static long findlcm(int arr[], int n) 
	{ 
	    long ans = arr[0]; 
	    for (int i = 1; i < n; i++) 
	        ans = (((arr[i] * ans)) / 
	                (gcd(arr[i], ans))); 
	    return ans; 
	} 
}
