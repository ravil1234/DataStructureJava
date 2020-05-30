package arrayques;
import java.util.*;
public class canuread {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		for(int i=0;i<str.length();i++)
		{
		      char ch=str.charAt(i);
		    	 System.out.print(ch);
		    	 if(i<str.length()-1)
		    	 {
		    		 char ch2=str.charAt(i+1);
				     if(ch2>=65&&ch2<=90)
				     {
				    	 System.out.println();
				     }
		    	 }
		    	 
		}

	}

}
