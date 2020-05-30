package DynamicProgramming;
import java.util.*;
public class N_knapsack {
	static int max=0;
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
		knap(a,b,s,0,0);
		System.out.println(max);
	}
public static void knap(int a[],int b[],int s,int ss,int sum)
{
	if(s==0)
	{
		
	   if(max<sum)
	   {
		   max=sum;
	   }
	   return;
	}
	
	for(int i=0;i<a.length;i++)
	{
		if(s>=a[i])
		{
			knap(a,b,s-a[i],ss+a[i],sum+b[i]);
		}
	}
}
}
