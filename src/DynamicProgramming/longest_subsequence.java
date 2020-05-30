package DynamicProgramming;
import java.util.*;
public class longest_subsequence
{
    public static void main(String args[]) 
    {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    int dp[]=new int[n];
    Arrays.fill(dp,1);
    for(int i=1;i<n;i++)
    {
    	for(int j=0;j<i;j++)
    	{
    	  if(a[j]<a[i])
    	  {
    		  dp[i]=Math.max(dp[i],dp[j]+1);
    	  }
    	}
      }
    int max=dp[0];
    for(int j=1;j<dp.length;j++)
    {
    	if(max<dp[j])
    		max=dp[j];
    }
    System.out.println(max);
    }
}