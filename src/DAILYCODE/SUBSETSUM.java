package DAILYCODE;
import java.util.*;
public class SUBSETSUM {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int m=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
    	a[i]=sc.nextInt();  
      }
      int sum=0,count=0;
      for(int i=0;i<n;i++)
      {
    	  sum=a[i];
    	  if(sum==m)
    	  {
    		  count=1;
    		  System.out.print("Yes");
    		  break;
    	  }
    	  int g=i+1;
    	  for(int j=i+1;j<n;j++)
    	  {
    		  sum=sum+a[j];
    		  if(sum==m)
    		  {
    			  count=1;
    			  break;
    		  }
    		  if(j==n-1)
    		  {
    			  sum=a[i];
    			  j=g;
    			  g++;
    		  }
    	  }
    	  if(count==1)
    	  {
    		  System.out.print("Yes");
    		  break;
    	  }
    	  
      }
      if(count==0)
    	  System.out.print("No");
	}
}
