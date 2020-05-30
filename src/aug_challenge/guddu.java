package aug_challenge;
import java.util.*;
public class guddu {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
		int n=sc.nextInt();
		int a[]=new int[n+1];
		a[0]=Integer.MIN_VALUE;
		for(int i=1;i<=n;i++)
		{
			a[i]=sc.nextInt();
		}		
		int count=0;
		for(int i=1;i<=n-1;i++)
		{
			for(int j=i+1;j<=n;j++)
			{
					int sum=0;
					int sum2=0;
					for(int l=i;l<j;l++)
					{
						sum=sum^a[l];
					}
					for(int k=j;k<=n;k++)
					{
						sum2=sum2^a[k];
					if(sum==sum2)
					   count++;	
				  }
			   }
			}
		System.out.println(count);
		t--;
		}
	}
}
