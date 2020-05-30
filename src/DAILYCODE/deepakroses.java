package DAILYCODE;
import java.util.*;
public class deepakroses {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		long res1=0,res2=0;
		while(t!=0)
		{
			long min=Integer.MAX_VALUE;
			long sum=0;
			int n=sc.nextInt();
			long a[]=new long[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextLong();			
       		}
              long m=sc.nextInt();
              for(int i=0;i<n;i++)
              {
            	  if(m>a[i])
            	  {
            	  for(int j=i+1;j<n;j++)
            	  {
            		  sum=a[i]+a[j];
            		  if(sum==m)
            		  {
            			  long g=Math.abs(a[i]-a[j]);
            			  if(min>g)
            			  {
            				  min=g;
            				   res1=a[i];
            				   res2=a[j];
            			  }
            		  }		  
            	  }
                }
              }
              if(res1<=res2)
              System.out.println("Deepak should buy roses whose prices are "+res1+" and "+res2+".");
              else
            	  System.out.println("Deepak should buy roses whose prices are "+res2+" and "+res1+".");
              t--;
	    }

    }

}