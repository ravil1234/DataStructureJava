package GeeksforGeeks;
import  java.util.*;
class dynamic_minop {
	public static void main (String[] args) 
	{
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n+1];
		    Arrays.fill(a,-1);
		    System.out.println(path(n,2,a)+2);
		    t--;
		}
	}
	public static int path(int n,int s,int dp[])
	{
	    if(n==s)
	     return 0;
	     if(s>n)
	      return Integer.MAX_VALUE-1;
	     
	      if(dp[s]!=-1)
	        return dp[s];
	     int f1=1+path(n,s+1,dp);
	     int f2=1+path(n,2*s,dp);
	     dp[s]= Math.min(f1,f2);
	     return dp[s];
	}
}