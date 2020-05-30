package DynamicProgramming;
import java.util.*;
class nknapsackdp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		int d[]=new int[s+1];
		for(int i=0;i<=s;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[j]<=i)
				{
					d[i]=Math.max(d[i],d[i-a[j]]+b[j]);
				}
			}
		}
       System.out.println(d[s]);
	}

}
