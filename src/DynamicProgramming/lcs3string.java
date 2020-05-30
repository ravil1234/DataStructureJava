package DynamicProgramming;
import java.util.*;
public class lcs3string {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		String s3=sc.next();
		//System.out.println(lcs(s1,s2,s3));
		System.out.println(lcsit(s1,s2,s3));
	}
public static int lcs(String s1,String s2,String s3)
{
	if(s1.length()==0||s2.length()==0||s3.length()==0)
	{
		return 0;
	}
	char ch1=s1.charAt(0);
	char ch2=s2.charAt(0);
	char ch3=s3.charAt(0);
	String ros1=s1.substring(1);
	String ros2=s2.substring(1);
	String ros3=s3.substring(1);
	if(ch1==ch2&&ch2==ch3)
	{
		return 1+lcs(ros1,ros2,ros3);
	}
	else
	{
		int f1=lcs(s1,ros2,s3);
		int f2=lcs(ros1,s2,s3);
		int f3=lcs(s1,s2,ros3);
	  return Math.max(f1,Math.max(f2, f3));	
	}
}
public static int lcsit(String s1,String s2,String s3)
{
	int dp[][][]=new int[s1.length()+1][s2.length()+1][s3.length()+1];
	dp[0][0][0]=0;
	for(int i=0;i<=s1.length();i++)
	{
		for(int j=0;j<=s2.length();j++)
		{
			for(int k=0;k<=s3.length();k++)
			{
				if(i==0||j==0||k==0)
				{
					dp[i][j][k]=0;
					continue;
				}
				if(s1.charAt(i-1)==s2.charAt(j-1)&&s2.charAt(j-1)==s3.charAt(k-1))
				{
					dp[i][j][k]=1+dp[i-1][j-1][k-1];
				}
				else
				{
					dp[i][j][k]=Math.max(dp[i-1][j][k], Math.max(dp[i][j-1][k],dp[i][j][k-1]));
				}
			}
		}
	}
	return dp[s1.length()][s2.length()][s3.length()];
}
}
