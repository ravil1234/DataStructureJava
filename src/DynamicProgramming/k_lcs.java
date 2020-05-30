package DynamicProgramming;
import java.util.*;
public class k_lcs {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++)
        {
        	a[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++)
        {
        	b[i]=sc.nextInt();
        }
       
        int dp[][][]=new int[a.length+1][b.length+1][k+1];
        
        dp[0][0][0]=0;
        for(int i=0;i<=a.length;i++)
        {
        	for(int j=0;j<=b.length;j++)
        	{
        		for(int l=0;l<=k;l++)
        		{
        			if(i==0||j==0||l==0)
        			{
        				dp[i][j][l]=0;
        				continue;
        			}
        			if(a[i-1]==b[j-1])
        			{
        				dp[i][j][l]=Math.max(dp[i-1][j-1][l],Math.max(dp[i-1][j][l],dp[i][j-1][l]));
        				
        				
        			}
        			else
        			{	
        				
        				dp[i][j][l]=Math.max(1+dp[i-1][j-1][l-1],Math.max(dp[i-1][j][l], dp[i][j-1][l]));
        			}
        		}
        	}
        }
        System.out.println(dp[a.length][b.length][k]);
	}
}
