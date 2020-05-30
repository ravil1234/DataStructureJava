package DAILYCODE;
import java.util.*;
public class FOUNDAT {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long a[]=new long[n];
		for(int i=0;i<n;i++)
		{
		   a[i]=sc.nextLong();	
		}
		long m=sc.nextLong();
		System.out.print(rec(a,m,0,n));
	}
	public static int  rec(long a[],long m,int si,int n)
	{
		
		if(a[si]==m)
		{
			return si;
		}
		if(si==n-1)
		{
			return -1;
		}
		return rec(a,m,si+1,n);
	}

}
