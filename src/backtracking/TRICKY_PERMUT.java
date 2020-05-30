package backtracking;
import java.util.*;
public class TRICKY_PERMUT {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char ch[]=s.toCharArray();
		Arrays.sort(ch);
		s=new String(ch);
       permut(s,"");
	}
public static void permut(String s,String ans)
{
	if(s.length()==0)
	{
		System.out.println(ans);
		return;
	}
	for(int i=0;i<s.length();i++)
	{
		if(isvalid(s,i))
		{
	   char ch=s.charAt(i);
	   String ros=s.substring(0,i)+s.substring(i+1);
	    permut(ros,ans+ch);
		}
	}	
}
public static boolean isvalid(String s,int i)
{
	for(int j=i+1;j<s.length();j++)
	{
		if(s.charAt(j)==s.charAt(i))
		{
			return false;
		}
	}
	return true;
  }
}
