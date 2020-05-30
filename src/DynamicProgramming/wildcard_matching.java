package DynamicProgramming;
import java.util.*;
public class wildcard_matching {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		int dp[][]=new int[s1.length()+1][s2.length()+1];
		dp[0][0]=1;
		for(int i=0;i<s2.length();i++)
		{
			if(s2.charAt(i)=='*')
			{
				dp[0][i+1]=dp[0][i];
			}
		}
		for(int i=1;i<=s1.length();i++)
		{
			for(int j=1;j<=s2.length();j++)
			{
				if(s1.charAt(i-1)==s2.charAt(j-1))
				{
					dp[i][j]=dp[i-1][j-1];
				}
				else if(s2.charAt(j-1)=='?')
				{
					dp[i][j]=dp[i-1][j-1];
				}
				else if(s2.charAt(j-1)=='*')
				{
					dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
				}
				else
				{
					dp[i][j]=0;
				}
			}
		}
      System.out.println(dp[s1.length()][s2.length()]);
	}
}
