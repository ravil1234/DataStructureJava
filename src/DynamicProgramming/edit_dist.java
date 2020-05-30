package DynamicProgramming;
import java.util.*;
public class edit_dist {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		long t=System.currentTimeMillis();
		//System.out.println(edit(s1,s2));
		System.out.println(System.currentTimeMillis()-t);
		t=System.currentTimeMillis();
		System.out.println(editdistance(s1,s2));
		System.out.println(System.currentTimeMillis()-t);
	}
public static int  edit(String s1,String s2)
{
	if(s1.length()==0)
		return s2.length();
	if(s2.length()==0)
		return s1.length();
	String ros1=s1.substring(1);
	String ros2=s2.substring(1);
	if(s1.charAt(0)==s2.charAt(0))
	{
		return edit(ros1,ros2);
	}
	else
	{
		// replace charcters within
		int f1=1+edit(ros1,ros2);
		// add characters 
		int f2=1+edit(ros1,s2);
		// remove characters
		int f3=1+edit(s1,ros2);
		return Math.min(f1, Math.min(f2,f3));
	}
  }
public static int editdistance(String s1,String s2)
{
   int strg[][]=new int[s1.length()+1][s2.length()+1];
     //seed 
   strg[s1.length()][s2.length()]=0;

   for(int i=s1.length();i>=0;i--)
   {
	   for(int j=s2.length();j>=0;j--)
	   {
		   if(i==s1.length())
		   {
			   strg[i][j]=s2.length()-j;
			   continue;
		   }
		   else if(j==s2.length())
		   {
			   strg[i][j]=s1.length()-i;
			   continue;
		   }
		   if(s1.charAt(i)==s2.charAt(j))
		   {
			   strg[i][j]=strg[i+1][j+1];
		   }
		   else
		   {
			   strg[i][j]=1+Math.min(strg[i+1][j],Math.min(strg[i][j+1],strg[i+1][j+1]));
		   }
	   }
   }
   return strg[0][0];
}
}
