package GeeksforGeeks;
import java.util.*;
public class print {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
		    int n=sc.nextInt();
		    System.out.print(n+" ");
		    prin(n-5,n);
		    System.out.print(n);
		    t--;
		    System.out.println();
		}
	}
	public static void prin(int n,int res)
	{   
	    if(n<=0)
	    {
	   	System.out.print(n+" ");
	    prin1(n+5,res);
	    }
	    else
	    {
	    	System.out.print(n+" ");
	        prin(n-5,res);
	    }
	}
	public static void prin1(int n,int res)
	{   
	    if(n==res)
	    {
	      return;
	    }
	    	System.out.print(n+" ");
	        prin1(n+5,res);
	}
}
