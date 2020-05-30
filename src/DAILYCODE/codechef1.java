package DAILYCODE;
import java.util.*;
public class codechef1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
			int n=sc.nextInt();
			double sum=0;
			float a[]=new float[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
				sum=sum+a[i];
			}
			if(t!=1)
			System.out.println();
			double m1=sum/n;
			int count=0;
			int s=0;
	        for(int i=0;i<n;i++)
	        {
	        	if(m1==a[i])
	        	{
	        		count=1;
	        		System.out.print(i+1);
	        		break;
	        	}
	        }
	       
	        if(count==0)
	        {
	        	System.out.print("Impossible");
	        }
	    t--;
	}
  }
}
