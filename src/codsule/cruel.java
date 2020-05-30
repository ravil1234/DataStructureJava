package codsule;
import java.util.*;
public class cruel {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int max1=0;
        for(int i=0;i<n;i++)
        {
        	int max=0;
        	long sum=0;
        	for(int j=i+1;j<n;j++)
        	{
        		 sum=a[i]+a[j];
        		if(sum%k!=0)
        		{
        			max++;
        		}
        		else
        		{
        			if(max1<max)
        			{
        				max1=max;
        			}
        			max=0;
        		}
        	}

			if(max1<max)
			{
				max1=max;
			}
        }
        System.out.println(max1+1);
	}

}
