package arrayques;
import java.util.*;
public class circular_sum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
	    
	    long max;
		int n=sc.nextInt();
		long arr[]=new long[n];
		long b[]=new long[10000000];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		long sum=0;
		int k=0;
		for(int i=0;i<n;i++)
		{
			sum=arr[i];
			if(sum<0)
			{
				sum=0;
			}
			else
			{
				b[k]=sum;
				k++;
			}
			for(int j=i+1;j<n;j++)
			{
				if(j==i)
				{
					break;
				}
				sum=sum+arr[j];
				if(sum<0)
				{
					sum=0;
				}
				else
				{
					b[k]=sum;
					k++;
				}
				if(j==n-1)
				{
					j=-1;
				}
			}
		}
		max=b[0];
		for(int l=1;l<k;l++)
		{
			if(max<=b[l])
			{
				max=b[l];
			}
		}
		System.out.println(max);
		t--;
		}

	}

}
