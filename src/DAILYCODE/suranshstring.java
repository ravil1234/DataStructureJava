package DAILYCODE;
import java.util.*;
public class suranshstring {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
			String a=sc.next();
			String b=sc.next();
			string(a,b,"",0,0);
			t--;
		}

	}
	public static void string(String a,String b,String c,int i,int j)
	{
		if(a.length()==0||b.length()==0)
		{
			c=c+a+b;
			System.out.println(c);
			return;
		}
	     char ch=a.charAt(i);
	     char ch1=b.charAt(j);
	     if(ch>ch1)
	     {
	    	 String res1=b.substring(0,j)+b.substring(j+1);
	    	 string(a,res1,c+ch1,i,j+1);
	    	 
	     }
	     else
	     {
	    	 String res=a.substring(0,i)+a.substring(i+1);
	    	 string(res,b,c+ch,i+1,j); 
	     }
	     
	}

}
