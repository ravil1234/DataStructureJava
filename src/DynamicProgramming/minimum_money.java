package DynamicProgramming;
import java.util.*;
public class minimum_money 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int w=sc.nextInt();
		int wt[]=new int[w];
		
	for(int i=0;i<w;i++)
	{
	   wt[i]=sc.nextInt();
	}
      int n=wt.length;
	ArrayList<Integer> a=new ArrayList<>();
	ArrayList<Integer> b=new ArrayList<>();
	for(int i=0;i<n;i++)
	{
		if(wt[i]!=-1)
		{
			a.add(wt[i]);
			b.add(i+1);
		}
	}
	n=a.size();
	double dp[][]=new double[n+1][w+1];
	for(int i=0;i<=n;i++)
	{
		for(int j=0;j<=w;j++)
		{
			if(i==0)
			{
				dp[i][j]=Double.POSITIVE_INFINITY;
				continue;
			}
			if(j==0)
			{
				dp[i][j]=0;
				continue;
			}
			if(b.get(i-1)>j)
			{
				dp[i][j]=dp[i-1][j];
			}
			else
			{
				dp[i][j]=Math.min(dp[i-1][j],dp[i][j-b.get(i-1)]+a.get(i-1));
			}
		  }
	   }
     if(dp[n][w]==Double.POSITIVE_INFINITY)
     {
    	 System.out.println("-1");
     }
     else
      System.out.println(dp[n][w]);
	}
}
