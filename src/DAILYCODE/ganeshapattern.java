package DAILYCODE;
import java.util.*;
public class ganeshapattern {
	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=0;i<=n/2;i++)
      {
    	  if(i!=n/2)
    	  {
    	 System.out.print("*");
 		 for(int k=0;k<n/2-1;k++)
 		 {
 			 System.out.print(" ");
 		 }
 		 System.out.print("*");
    	  if(i==0)
    	  {
    	  for(int k=0;k<n/2;k++)
    	  {
    		  System.out.print("*");
    	  }
    	 }
    	  }
    	   if(i==n/2)
    	  {
    		  for(int j=0;j<n;j++)
    		  {
    			  System.out.print("*");
    		  }
    	  }
    	  System.out.println();  
      }
      for(int i=n/2+1;i<n;i++)
      {
    	  if(i!=n-1)
    	  {
    	  for(int j=0;j<n/2;j++)
    	  {
    		  System.out.print(" ");
    	  }
    	  
    	 }
    	  else
    	  {
    		  for(int j=0;j<n/2;j++)
        	  {
        		  System.out.print("*");
        	  }
    	  }
    	  System.out.print("*");
    	  for(int j=0;j<n/2-1;j++)
    	  {
    		  System.out.print(" ");
    	  }
    	  System.out.print("*");
    	  System.out.println();
      }
      
	}

}
