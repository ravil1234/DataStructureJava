package DAILYCODE;
import java.util.*;
public class singhammoney {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0)
        {
        	long p=sc.nextInt();
        	long i=0;
        	long m=p;
        	long min=0;
        	while(true)
        	{
        		long l=(long)Math.pow(2, i);
        		if(l==m)
        		{
        			min++;;
        			break;	
        		}
        		if(l>m)
        		{
        			l=l/2;
        		   long s=m-l;
        		   min++;
        		   if(s==0)
        		   {
        			   break;
        		   }
        		   if(s==1)
        		   {
        			   min++;
        			   break;
        		   }
        		   m=s;
        		   i=0;
        		}
        		i++;
        	}
        	System.out.println(min);
        	t--;
	}
  }
}
