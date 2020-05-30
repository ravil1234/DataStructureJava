package recursionchallenges;
import java.util.*;
public class smartkeypad {
	static int count=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String table[] = { " ", ".+@$", "abc", "def"
				          , "ghi", "jkl" , "mno", "pqrs" 
				          , "tuv", "wxyz" };
		String SI[] = {
	            "prateek", "sneha", "deepak", "arnav", "shikha", "palak",
	            "utkarsh", "divyam", "vidhi", "sparsh", "akku"
	    };
		String n=sc.next();
	char res[]=new char[n.length()];
	  smartkey(table,n,0,res,0,SI);
	}
	public static void  smartkey(String s[],String n,int i,char res[],int j,String SI[])
	{
		if(i==n.length())
		{
			String o=new String(res);
			 o=".*"+o+".*";
			for(int l=0;l<SI.length;l++)
			{
				String s1=SI[l];
				if(s1.matches(o)==true)
				{
					System.out.println(s1);
				}
			}
			return;
		}
		char ch1=n.charAt(i);
		int g=Character.getNumericValue(ch1);
		String str=s[g];
		for(int k=0;k<str.length();k++)
		{
			  
		     char ch=str.charAt(k);
			   res[j]=ch;
			   smartkey(s,n,i+1,res,j+1,SI);
		}
			  
	}
}
