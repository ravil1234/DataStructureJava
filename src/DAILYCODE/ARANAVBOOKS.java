package DAILYCODE;
import java.util.*;
public class ARANAVBOOKS {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=-1,max1,sum=0;
		for(int i=0;i<n;i++)
		{
			max1=1;
			sum=a[i];
			for(int j=i+1;j<n;j++)
			{
				sum=sum+a[j];
				max1++;
				if(k==sum)
				{
					break;
				}
				if(sum>k)
				{
					max1--;
					break;
					
				}
				
			}
			if(max<max1)
			{
				max=max1;
			}
			
		}
		System.out.println(max);

	}

}
