package DAILYCODE;
import java.util.*;
    public class Codechef5 {
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int h=sc.nextInt();
       long s[]=new long[n];
       for(int i=0;i<n;i++)
       {
    	 s[i]=sc.nextLong();   
       }
       long cmd[]=new long[100000];
       int k=0;
       while(true)
       {
    	   int comnd=sc.nextInt();
    	   cmd[k]=comnd;
    	      k++;
    	   if(comnd==0)
    	   {
    		   break;
    	   }  
       }
       int j=0;
       long sum=0;
       for(int i=0;i<k;i++)
       {
    	   if(cmd[i]==1)
    	   {
    		   if(j==0)
    		   {
    			   
    		   }
    		   else
    		   {
    			   j=j-1;
    		   }
    	   }
    	   else if(cmd[i]==2)
    	   {
    		   if(j==n-1)
    		   {
    			   
    		   }
    		   else
    		   {
    			   j=j+1;
    		   }
    		  
    	   }
    	   else if(cmd[i]==3)
    	   {
    		if(sum==0&&s[j]!=0)
    		{
    			sum=1;
    			s[j]=s[j]-1;
    		}
    		   
    	   }
    	   else if(cmd[i]==4)
    	   {
    		   if(sum!=0&&s[j]!=h)
    		   {
    			   s[j]=s[j]+1;
    			   sum=0;
    			   
    		   }
    		  
    	   }
    	   else
    	   {
    		   break;
    	   }
       }
       for(int i=0;i<n;i++)
       {
    	 System.out.print(s[i]+" ");   
       }
      
	}

}
