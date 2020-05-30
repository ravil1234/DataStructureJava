package DAILYCODE;
 import java.util.*;
public class increaseseq {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
			int n=sc.nextInt();
			long a[]=new long[n];
			long w[]=new long[n];
			long m[]=new long[1000000];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextLong();
			}
			for(int i=0;i<n;i++)
			{
				w[i]=sc.nextLong();
			}
			long sum=0,max=0;
			for(int i=0;i<n;i++)
			{
				sum=w[i];
				for(int j=i+1;j<n;j++)
				{
					if(a[i]<a[j])
					{
						sum=sum+w[j];
					}
					else
					{
						
					}
					if(j==n-1)
					{
						if(max<sum)
							  max=sum;
					}
				}
			}
			System.out.println(max);
			t--;
		}
	}

}
