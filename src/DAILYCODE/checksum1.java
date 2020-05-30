package DAILYCODE;
import java.util.*;
public class checksum1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
			int count=0;
			String str=sc.next();
			char a[]=new char[str.length()];
			for(int i=0;i<str.length();i++)
			{
			    a[i]=str.charAt(i);
			}
			String s="",s1="",s2="";
			for(int i=0;i<a.length;i++)
			{
				count=0;
				s=s+a[i];
				long first=Integer.valueOf(s);
				System.out.println("1st "+first);
				for(int j=i+1;j<a.length;j++)
				{
				      s1=s1+a[j];
				      long second=Integer.valueOf(s1);
				      System.out.println("2nd "+second);
				      for(int k=j+1;k<a.length;k++)
				      {
				    	  s2=s2+a[k];
				    	  long third=Integer.valueOf(s2);
				    	  System.out.println("3rd "+third);
				    	  if((first+second)==third)
				    	  {
				    		  i=j+1;
				    		  s="";
				    		  s1="";
				    		  s2="";
				    		  count=1;
				    		  break;
				    	  }
				      }
				      if(count==0)
				      {
				    	  s2="";
				      }
				      else
				    	  break;
				}
				
			}
			if(count==1)
				System.out.println("Yes");
			else
				System.out.println("No");
			t--;
		}

	}

}
