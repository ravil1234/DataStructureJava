package DAILYCODE;
import java.util.*;
public class length_sum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=sc.nextInt();
		int s1=s;
	     int a[]=new int[n];
	     if(s==0)
	     {
	    	 if(n==1)
	    	 {
	    		 System.out.print(0+" "+0);
	    	 }
	    	 else
	    	 System.out.print(-1+" "+-1);
	     }
	     else if(s>(9*n))
	     {
	    	 System.out.print(-1+" "+-1);
	     }
	     else
	     {
	    	 s=s-1;
	     for(int i=n-1;i>0;i--)
	     {
	    	 if(s>9)
	    	 {
	    		 a[i]=9;
	    		 s=s-9;
	    	 }
	    	 else
	    	 {
	    		 a[i]=s;
	    		 s=0;
	    	 }
	     }
	     a[0]=s+1;
	    for(int i=0;i<n;i++)
	    {
	    	System.out.print(a[i]);
	    }
	    s=s1;
	    for(int i=0;i<n;i++)
	    {
	    	if(s>=9)
	    	{
	    		a[i]=9;
	    		s=s-9;
	    	}
	    	else
	    	{
	    		a[i]=s;
	    		s=0;
	    	}
	    }
	    System.out.print(" ");
	    for(int i=0;i<n;i++)
	    {
	    	System.out.print(a[i]);
	    }
	  }
     	
	}

}
