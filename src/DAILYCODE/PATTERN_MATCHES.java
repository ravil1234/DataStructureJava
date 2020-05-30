package DAILYCODE;
import java.util.*;
public class PATTERN_MATCHES {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String s1=sc.next();
		int c=0;
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(s1.charAt(0)!=s.charAt(0)&&s1.charAt(0)!='*'&&s1.charAt(0)!='?')
			{
			          c=1;
				System.out.println("NOT MATCHED");
				break;
			}
			if(i+1<s1.length())
			{
			  if(ch!='*'&&ch!='?'&&s1.charAt(i+1)=='*'&&(i+1)==s1.length()-1)
			    {
				break;
			    }
			
			if(ch!='*'&&ch!='?')
			{
			  s2=s2+ch;
			}
			else
			{
				//System.out.println(s2);
				if(s2.length()>0)
				{
				if(s.regionMatches(0,s2, 0, s2.length()-1))
				{
					s2="";
				}
				else
				{
					c=1;
					System.out.println("NOT MATCHED");
					break;
				}
			}
			}
		  }
			/*
			else
			{
				if(ch=='?'||ch=='*'||ch==s.charAt(s.length()-1))
				{
					c=1;
					System.out.println("MATCHED");
					break;
				}
				else
				{
					c=1;
					System.out.println("NOT MATCHED");
					break;
				}
			}
			*/
		}
	if(c==0)
	{
		System.out.println("MATCHED");
	}

	}

}
