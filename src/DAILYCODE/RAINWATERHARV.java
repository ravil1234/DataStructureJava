package DAILYCODE;
import java.util.*;
public class RAINWATERHARV {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=a[0];
		int sum1=0;
		int sum=0;
		int g=0;
		for(int i=1;i<n;i++)
		{
			if(max<=a[i])
			{
				max=a[i];
				g=i;
				sum1=sum1+sum;
				sum=0;
			}
			else
			{
				int l=max-a[i];
				sum=sum+l;
			}
		}
		int max1=a[n-1];
		sum=0;
		for(int j=n-2;j>=g;j--)
		{
			if(max1<=a[j])
			{
				max1=a[j];
				sum1=sum1+sum;
				sum=0;
			}
			else
			{
				int l=max1-a[j];
				sum=sum+l;
			}
		}
		System.out.println(sum1);
         t--;
		}
	}

}
