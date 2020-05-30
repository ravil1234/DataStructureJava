package DynamicProgramming;
import java.util.*;
public class mixtures {
	static int dp[][]=new int[100][100];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Scanner sc=new Scanner(System.in);
	  int  n=sc.nextInt();
	  int a[]=new int[n];
	  for(int i=0;i<n;i++)
	  {
		  a[i]=sc.nextInt();
	  }
	  for(int i=0;i<20;i++)
		  for(int j=0;j<20;j++)
			  dp[i][j]=-1;
	System.out.println( mix(0,n-1,a));
	}
	public static int mix(int i,int j,int a[])
	{
		if(i>=j)
		{
			return 0;
		}
		if(dp[i][j]!=-1)
			return dp[i][j];
	   dp[i][j]=Integer.MAX_VALUE;
		for(int k=i;k<=j;k++)
		{
		   int k1= mix(i,k,a);
		    int k2=mix(k+1,j,a);
			int kmax=sum(i,k,a)*sum(k+1,j,a);
			dp[i][j]=Math.min(dp[i][j],k1+k2+kmax);
		}
		return dp[i][j];
	}
public static int sum(int s,int e,int a[])
{
	int t=0;
     for(int i=s;i<=e;i++)
     {
    	 t+=a[i];
    	 t=t%100;
     }
     return t;
}
}