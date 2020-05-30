package DAILYCODE;
import java.util.*;
public class CODECHEF2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      
      while(t!=0)
      {
    	  int n=sc.nextInt();
   
    	  int q[]=new int[n];
    	  int s[]=new int[100];
    	  int k=0;
    	  int even=0;
    	  int odd=0;
    	  for(int i=0;i<n;i++)
    	  {
    		  q[i]=sc.nextInt();
    	  }
              s[0]=q[0]; 
                 k++;
              int o=setbit(s[0]);
              
              if(o==1)
            	  even++;
              else
            	  odd++;
              k++;
              System.out.println(even+" "+odd);
    		for(int i=1;i<n;i++)
    		{
    			int c=0;
    			for(int j=0;j<k;j++)
    			{
    				if(q[i]==s[j])
    				{
    					c=1;
    					break;
    				}
    			 }
    			s[k]=q[i];
    			o=setbit(s[k]);
    			 if(o==1)
               	  even++;
                 else
               	  odd++;
    			k++;
    			int g=k-2;
    			if(c==0)
    			{
    				for(int j=0;j<g;j++)
    				{
    					s[k]=s[j]^q[i];
    					o=setbit(s[k]);
    	    			 if(o==1)
    	               	  even++;
    	                 else
    	               	  odd++;
    					  k++;
    				}
    				System.out.println(even+" "+odd);
    			}
    			
    		}
    		t--;
    	 }
      
      }
	public static int setbit(int n)
	{
		int c=0;
		while(n>0)
		{
			int r=n%2;
			if(r==1)
				c++;
			n=n/2;
		}
		if(c%2==0)
		{
			return 1;
		}
		else
			return 0;
	}
 }
