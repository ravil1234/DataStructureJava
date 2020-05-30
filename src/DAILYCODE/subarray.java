package DAILYCODE;
import java.util.*;
public class subarray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
			int n=sc.nextInt();
			long a[]=new long[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextLong();
			}
			int max=0;
			for(int i=0;i<n;i++)
			{
				long l=a[i];
				int max1=0;
				for(int j=n-1;j>=0;j--)
				{
					if(l>=a[j])
					{
						max1=j-i+1;
						break;
					}
				}
				if(max<max1)
				{
					max=max1;
				}
			}
			System.out.println(max);
			t--;
		}

	}

}
