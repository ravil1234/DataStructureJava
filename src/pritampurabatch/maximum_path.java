package pritampurabatch;
import java.util.*;
public class maximum_path {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[m];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<m;i++)
		{
			b[i]=sc.nextInt();
		}
		int sum1=0,sum2=0,max=0;
		int i=0,j=0;
		while(i<n&&j<m)
		{
			if(a[i]<b[j])
			{
				sum1=sum1+a[i];
				i++;
			}
			else if(a[i]>b[j])
			{
				sum2=sum2+b[j];
				j++;
			}
			else
			{
				max=max+(Math.max(sum1, sum2));
				sum1=0;sum2=0;
				while(i<n&&j<m&&a[i]==b[j])
				{
					max=max+a[i];
					i++;
					j++;
				}
			}
		}
		while(i<n)
		{
			sum1=sum1+a[i];
		    i++;
		}
		while(j<m)
		{
			sum2=sum2+b[j];
			j++;
		}
		max=max+ Math.max(sum1,sum2);
		System.out.println(max);
		t--;
		}
	}
}
