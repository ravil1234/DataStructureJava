package DAILYCODE;
import java.util.*;
public class RATINJUNGLE {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int sum=0;
		for(int i=0;i<n;i++)
		{
		       a[i]	=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]!=-1)
			{
			int count=0;
			for(int j=0;j<n;j++)
			{
				if(a[i]==a[j]&&i!=j&&a[j]!=-1)
				{
					count++;
					a[j]=-1;
				}
				
			}
	       if(count<=a[i]+1)
	       {
	    	   sum=sum+1+a[i];
	       }
	       else
	       {
		      int s=count/(a[i]+1);
		      int k=s*(a[i]+1);
		      sum=sum+k+a[i]+1;
			}
  			
		}
			a[i]=-1;
		}
		
		System.out.println(sum);
	}

}

