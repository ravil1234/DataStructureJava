package arrayques;

import java.util.Scanner;
/* 2,3,5,7,11,13,17,19,23,29*/
public class CBno {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str=sc.next();
		String s="";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
		        char ch=str.charAt(i);
		          s=s+ch;
		    	long a=Long.parseLong(s);
		    	if(a==2||a==3||a==5||a==7)
		    	{
		    		s="";
		    		count++;
		    	}
		    	else
		    	{
		    	for(int j=i+1;j<str.length();j++)
		    	{
		    		char ch1=str.charAt(j);
			          s=s+ch1;
			    	a=Long.parseLong(s);
			    	if(a==11||a==13||a==17||a==19||a==23||a==29)
			    	{
			    		s="";
			    		i=j;
			    		count++;
			    		break;
			    	}
			    	else
			    	{
			    		if(a%2!=0&&a%3!=0&&a%5!=0&&a%7!=0&&a%11!=0
			    		   &&a%13!=0&&a%17!=0&&a%19!=0&&a%23!=0&&a%29!=0)
			    		{
			    			s="";
			    			i=j;
			    			count++;
			    			break;
			    		}
			    	}
			    	
		    	
		    }
		  }
		}
		System.out.print(count);

	}

}
