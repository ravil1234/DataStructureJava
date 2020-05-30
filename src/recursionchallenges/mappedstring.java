package recursionchallenges;
import java.util.*;
public class mappedstring {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	      String str=sc.next();
	      char a[]=new char[27]; 
	       a[0]=' ';
	      int k=1;
	      for(char i='A';i<='Z';i++)
	      {
	    	  a[k]=i;
	    	  k++;
	      }
	      codes(str,"",0,a);
       	    
	}
	public static void codes(String str,String ans,int i,char a[])
	{
		
	    if(i==str.length())
	    {
	    	System.out.println(ans);
	    	return;
	    }
	     char ch=str.charAt(i);
	     String s="";
	     if(i+1<str.length())
	     {
	    	  s=str.substring(i,i+2);
	     }
	     else
	    	 s=s+ch;
	     int c=Character.getNumericValue(ch);
	  codes(str,ans+a[c],i+1,a);
	     int l=Integer.parseInt(s);
	     if(l>9&&l<27)
	     {
	    	 codes(str,ans+a[l],i+2,a);
	     }
	    
	  }
}
