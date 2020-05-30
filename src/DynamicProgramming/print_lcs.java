package DynamicProgramming;
import java.util.*;
public class print_lcs 
{
	public static void main(String args[])
	{
	   Scanner sc=new Scanner(System.in);
	   String s1=sc.next();
	   String s2=sc.next();
	  print(s1,s2);
	}
	public static void print(String s1,String s2)
	{
		int a[][]=new int[s1.length()+1][s2.length()+1];
		for(int i=s1.length();i>=0;i--)
		{
			for(int j=s2.length();j>=0;j--)
			{
				if(i==s1.length()||j==s2.length())
				{
					a[i][j]=0;
					continue;
				}
				if(s1.charAt(i)==s2.charAt(j))
				{
					a[i][j]=1+a[i+1][j+1];
				}
				else
				{
				  a[i][j]=Math.max(a[i+1][j], a[i][j+1]);		  
				}
			}
		}
		
		int i=0,j=0;
		String s="";
		//char res[]=new char[a[0][0]];
		int ind=0;
		while(i<s1.length()&&j<s2.length())
		{
			if(s1.charAt(i)==s2.charAt(j))
			{
				s+=s1.charAt(i);
				i++;
				j++;
			}
			else if(a[i+1][j]>=a[i][j+1])
				i++;
			else
				j++;
		}
		System.out.println(s);
	}
}
