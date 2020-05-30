package algojava;

import java.util.*;

public class test2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		   pall(str);
	}
 public static void pall(String s)
	{
	    String s1="";
	    for(int i=s.length()-1;i>=0;i--)
	    {
	        s1=s1+s.charAt(i);
	    }
	    if(s1.equals(s))
	    {
	        System.out.println("Yes");
	    }
	    else
	    {
	        System.out.println("No");
	    }

	}

}
