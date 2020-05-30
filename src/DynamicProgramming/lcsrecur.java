package DynamicProgramming;
import java.util.Scanner;
public class lcsrecur {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		long start=System.currentTimeMillis();
		System.out.println(lcs(s1,s2));
	System.out.println("recursive time:"+(System.currentTimeMillis()-start));
	start=System.currentTimeMillis();
		System.out.println(lcsit(s1,s2));
		System.out.println("iterative time:"+(System.currentTimeMillis()-start));
	}
public static int lcs(String s1,String s2)
{
	if(s1.length()==0||s2.length()==0)
	{
		return 0;
	}
	char ch1=s1.charAt(0);
	char ch2=s2.charAt(0);
	String ros1=s1.substring(1);
	String ros2=s2.substring(1);
	if(ch1==ch2)
	{
		return 1+lcs(ros1,ros2);
	}
	else
	{
		int f1=lcs(ros1,s2);
		int f2 =lcs(s1,ros2);
		return Math.max(f1, f2);
	}
  }

// DP APPROACH

public static int lcsit(String s1,String s2)
{
	int strg[][]=new int[s1.length()+1][s2.length()+1];
	
	//seed the value
	strg[s1.length()][s2.length()]=0;
	for(int i=s1.length();i>=0;i--)
	{
		for(int j=s2.length();j>=0;j--)
		{
			if(i==s1.length()||j==s2.length())
			{
				strg[i][j]=0;
				continue;
			}
			if(s1.charAt(i)==s2.charAt(j))
			{
				strg[i][j]=1+strg[i+1][j+1];
			}
			else
			{
				strg[i][j]=Math.max(strg[i+1][j], strg[i][j+1]);
			}
		}
	}
	return strg[0][0];
  }
}


